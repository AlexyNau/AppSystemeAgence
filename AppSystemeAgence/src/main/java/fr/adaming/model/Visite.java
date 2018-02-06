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
@Table(name="visites")
public class Visite implements Serializable {

	//attribut date avec l'heure compris dedans
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_v")
	private int id;
	private Date date;
	
	
	//constructeur vide
	public Visite() {
		super();
	}
	
	//constructeur sans id
	public Visite(Date date) {
		super();
		this.date = date;
	}
	
	//constructeur avec id
	public Visite(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
	}
	
	//Getters et Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	//Methode ToString
	@Override
	public String toString() {
		return "Visite [id=" + id + ", date=" + date + "]";
	}
	
	
	
}
