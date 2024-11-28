package com.omar.tvs.service;

import java.util.List;
import com.omar.tvs.entities.Tv;
import com.omar.tvs.entities.Marque;

public interface TvService {
    Tv saveTv(Tv t);
    Tv updateTv(Tv t);
    void deleteTv(Tv t);
    void deleteTvById(Long id);
    Tv getTv(Long id);
    List<Tv> getAllTvs();
    List<Tv> findByNomTv(String nom);
    List<Tv> findByNomTvContains(String nom);
    List<Tv> findByNomPrix(String nom, Double prix);
    List<Tv> findByMarque(Marque marque);
    List<Tv> findByMarqueIdMar(Long id);
    List<Tv> findByOrderByNomTvAsc();
    List<Tv> trierTvsNomsPrix();
}
