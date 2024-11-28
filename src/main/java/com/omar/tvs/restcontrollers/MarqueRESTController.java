package com.omar.tvs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.omar.tvs.entities.Marque;
import com.omar.tvs.repos.MarqueRepository;

@RestController
@RequestMapping("/api/marque")
@CrossOrigin("*")
public class MarqueRESTController {
    
    @Autowired
    MarqueRepository marqueRepository;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Marque> getAllCategories() {
        return marqueRepository.findAll();
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Marque getMarqueById(@PathVariable("id") Long id) {
        return marqueRepository.findById(id).get();
    }
}
