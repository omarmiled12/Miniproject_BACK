package com.omar.tvs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.omar.tvs.entities.Tv;
import com.omar.tvs.service.TvService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TvRESTController {
    
    @Autowired
    TvService tvService;
    
    @RequestMapping(method = RequestMethod.GET)
    List<Tv> getAllTvs() {
        return tvService.getAllTvs();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Tv getTvById(@PathVariable("id") Long id) {
        return tvService.getTv(id);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public Tv createTv(@RequestBody Tv tv) {
        return tvService.saveTv(tv);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public Tv updateTv(@RequestBody Tv tv) {
        return tvService.updateTv(tv);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteTv(@PathVariable("id") Long id) {
        tvService.deleteTvById(id);
    }
    
    @RequestMapping(value = "/tvsMarque/{idMarque}", method = RequestMethod.GET)
    public List<Tv> getTvsByMarqueId(@PathVariable("idMarque") Long idMarque) {
        return tvService.findByMarqueIdMar(idMarque);
    }
    
    /*@RequestMapping(value = "/tvsByName/{nom}", method = RequestMethod.GET)
    public List<Tv> findByNomTvContains(@PathVariable("nom") String nom) 
    {
        return tvService.findByNomTvContains(nom);
    }*/
}
