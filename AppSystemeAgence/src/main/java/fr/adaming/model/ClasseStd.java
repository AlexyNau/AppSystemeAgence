package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClasseStd implements Serializable{
	
	
	//Attributs de la classe
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_classeStd")
	private int id;
	private String code;
	private String type_bien;
	private String mode_offre;
	private double prix_max;
	private double sup_min;
	
	
	//Constructeur vide
	public ClasseStd() {
		super();
	}


//constructeur sans id
	public ClasseStd(String code, String type_bien, String mode_offre, double prix_max, double sup_min) {
		super();
		this.code = code;
		this.type_bien = type_bien;
		this.mode_offre = mode_offre;
		this.prix_max = prix_max;
		this.sup_min = sup_min;
	}


//constructeur avec id
	public ClasseStd(int id, String code, String type_bien, String mode_offre, double prix_max, double sup_min) {
		super();
		this.id = id;
		this.code = code;
		this.type_bien = type_bien;
		this.mode_offre = mode_offre;
		this.prix_max = prix_max;
		this.sup_min = sup_min;
	}

//getters et setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getType_bien() {
		return type_bien;
	}


	public void setType_bien(String type_bien) {
		this.type_bien = type_bien;
	}


	public String getMode_offre() {
		return mode_offre;
	}


	public void setMode_offre(String mode_offre) {
		this.mode_offre = mode_offre;
	}


	public double getPrix_max() {
		return prix_max;
	}


	public void setPrix_max(double prix_max) {
		this.prix_max = prix_max;
	}


	public double getSup_min() {
		return sup_min;
	}


	public void setSup_min(double sup_min) {
		this.sup_min = sup_min;
	}


	//ToString
	@Override
	public String toString() {
		return "ClasseStd [id=" + id + ", code=" + code + ", type_bien=" + type_bien + ", mode_offre=" + mode_offre
				+ ", prix_max=" + prix_max + ", sup_min=" + sup_min + "]";
	}
	
	
	
	
	

}
