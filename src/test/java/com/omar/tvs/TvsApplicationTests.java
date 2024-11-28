package com.omar.tvs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.omar.tvs.entities.Tv;
import com.omar.tvs.entities.Marque;
import com.omar.tvs.repos.TvRepository;

@SpringBootTest
class TvsApplicationTests {
    
    @Autowired
    private TvRepository tvRepository;
    
    @Test
    public void testCreateTv() {
        Tv tv = new Tv("Samsung TV", 5000.000, new Date());
        tvRepository.save(tv);
    }
    
    @Test
    public void testFindTv() {
        Tv t = tvRepository.findById(1L).get();
        System.out.println(t);
    }
    
    @Test
    public void testUpdateTv() {
        Tv t = tvRepository.findById(1L).get();
        t.setPrixTv(4500.0);
        tvRepository.save(t);
    }
    
    @Test
    public void testDeleteTv() {
        tvRepository.deleteById(1L);
    }
    
    @Test
    public void testListerTousTvs() {
        List<Tv> tvs = tvRepository.findAll();
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testFindTvByNom() {
        List<Tv> tvs = tvRepository.findByNomTv("LG TV");
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testFindTvByNomContains() {
        List<Tv> tvs = tvRepository.findByNomTvContains("S");
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testFindByNomPrix() {
        List<Tv> tvs = tvRepository.findByNomPrix("Samsung TV", 3000.0);
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testFindByMarque() {
        Marque marque = new Marque();
        marque.setIdMar(2L);
        List<Tv> tvs = tvRepository.findByMarque(marque);
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testFindByMarqueIdMarque() {
        List<Tv> tvs = tvRepository.findByMarqueIdMar(1L);
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testFindByOrderByNomTvAsc() {
        List<Tv> tvs = tvRepository.findByOrderByNomTvAsc();
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
    
    @Test
    public void testTrierTvsNomsPrix() {
        List<Tv> tvs = tvRepository.trierTvsNomsPrix();
        for (Tv t : tvs) {
            System.out.println(t);
        }
    }
}
