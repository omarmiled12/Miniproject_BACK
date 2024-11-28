package com.omar.tvs.repos;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omar.tvs.entities.Marque;
import com.omar.tvs.entities.Tv;

@RepositoryRestResource(path = "rest")
@RestController
@RequestMapping("/tvs/rest")


public interface TvRepository extends JpaRepository<Tv, Long> {
	List<Tv> findByNomTv(String nom);
	 List<Tv> findByNomTvContains(String nom); 
	/* @Query("select p from Tv p where p.nomTv like %?1 and p.prixTv > ?2")
	 List<Tv> findByNomPrix (String nom, Double prix);*/
	 
	 @Query("select p from Tv p where p.nomTv like %:nom and p.prixTv > :prix")
	 List<Tv> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	 
	 
	 @Query("select p from Tv p where p.marque = ?1")
	 List<Tv> findByMarque (Marque marque);
	 
	 
	 
	 List<Tv> findByMarqueIdMar(Long id);
	 
	 List<Tv> findByOrderByNomTvAsc();
	 
	 
	 @Query("select p from Tv p order by p.nomTv ASC, p.prixTv DESC")
	 List<Tv> trierTvsNomsPrix ();

}
