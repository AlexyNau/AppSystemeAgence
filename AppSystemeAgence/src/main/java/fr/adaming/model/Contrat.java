package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contrats")
public class Contrat implements Serializable{

	// Les attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contrat")
	private int id;
	private double prix;
	private Date date;
	private String type; // Location ou Vente

	// Les constructeurs
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(double prix, Date date, String type) {
		super();
		this.prix = prix;
		this.date = date;
		this.type = type;
	}

	public Contrat(int id, double prix, Date date, String type) {
		super();
		this.id = id;
		this.prix = prix;
		this.date = date;
		this.type = type;
	}

	// Getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// ToString
	@Override
	public String toString() {
		return "Contrat [id=" + id + ", prix=" + prix + ", date=" + date + ", type=" + type + "]";
	}

}
