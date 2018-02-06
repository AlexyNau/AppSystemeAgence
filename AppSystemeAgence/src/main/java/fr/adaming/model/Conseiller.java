package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="conseillers")
public class Conseiller implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_conseiller")
	private int id;
	
	private String nom;
	
	private String mail;
	
	private String mdp;

	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Conseiller( String nom, String mail, String mdp) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.mdp = mdp;
	}

	public Conseiller(int id, String nom, String mail, String mdp) {
		super();
		this.id = id;
		this.nom = nom;
		this.mail = mail;
		this.mdp = mdp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	@Override
	public String toString() {
		return "Conseiller [id=" + id + ", nom=" + nom + ", mail=" + mail + ", mdp=" + mdp + "]";
	}
	
	
	

}
