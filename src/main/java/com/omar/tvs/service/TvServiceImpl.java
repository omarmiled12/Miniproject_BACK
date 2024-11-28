package com.omar.tvs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omar.tvs.entities.Tv;
import com.omar.tvs.entities.Marque;
import com.omar.tvs.repos.TvRepository;

@Service
public class TvServiceImpl implements TvService {

    @Autowired
    TvRepository tvRepository;

    @Override
    public Tv saveTv(Tv t) {
        return tvRepository.save(t);
    }

    @Override
    public Tv updateTv(Tv t) {
        return tvRepository.save(t);
    }

    @Override
    public void deleteTv(Tv t) {
        tvRepository.delete(t);
    }

    @Override
    public void deleteTvById(Long id) {
        tvRepository.deleteById(id);
    }

    @Override
    public Tv getTv(Long id) {
        return tvRepository.findById(id).get();
    }

    @Override
    public List<Tv> getAllTvs() {
        return tvRepository.findAll();
    }

    @Override
    public List<Tv> findByNomTv(String nom) {
        return tvRepository.findByNomTv(nom);
    }

    @Override
    public List<Tv> findByNomTvContains(String nom) {
        return tvRepository.findByNomTvContains(nom);
    }

    @Override
    public List<Tv> findByNomPrix(String nom, Double prix) {
        return tvRepository.findByNomPrix(nom, prix);
    }

    @Override
    public List<Tv> findByMarque(Marque marque) {
        return tvRepository.findByMarque(marque);
    }

    @Override
    public List<Tv> findByMarqueIdMar(Long id) {
        return tvRepository.findByMarqueIdMar(id);
    }

    @Override
    public List<Tv> findByOrderByNomTvAsc() {
        return tvRepository.findByOrderByNomTvAsc();
    }

    @Override
    public List<Tv> trierTvsNomsPrix() {
        return tvRepository.trierTvsNomsPrix();
    }
}
