package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contrats")
public class Contrat {

	// Les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_contrat")
	private int id;
	private double prix;
	private Date date;

	// Les constructeurs
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(double prix, Date date) {
		super();
		this.prix = prix;
		this.date = date;
	}

	public Contrat(int id, double prix, Date date) {
		super();
		this.id = id;
		this.prix = prix;
		this.date = date;
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

	// ToString
	@Override
	public String toString() {
		return "Contrat [id=" + id + ", prix=" + prix + ", date=" + date + "]";
	}
}
