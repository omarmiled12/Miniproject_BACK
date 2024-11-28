package com.omar.tvs.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Tv {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTv;
	private String nomTv;
	private Double prixTv;
	private Date dateCreation;
	
	
	@ManyToOne
	private Marque marque;

	
	
	
	
	

	public Tv() {
		super();
	
	}
	
	
	public Tv(String nomTv, Double prixTv, Date dateCreation) {
		super();
		this.nomTv = nomTv;
		this.prixTv = prixTv;
		this.dateCreation = dateCreation;
	}


	public Long getIdTv() {
		return idTv;
	}
	public void setIdTv(Long idTv) {
		this.idTv = idTv;
	}
	public String getNomTv() {
		return nomTv;
	}
	public void setNomTv(String nomTv) {
		this.nomTv = nomTv;
	}
	public Double getPrixTv() {
		return prixTv;
	}
	public void setPrixTv(Double prixTv) {
		this.prixTv = prixTv;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Marque getMarque() {
		return marque;
	}


	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	
	public String toString() {
		return "Tv [idTv=" + idTv + ", nomTv=" + nomTv + ", prixTv=" + prixTv + ", dateCreation=" + dateCreation + "]";
	}
	 
	

}
