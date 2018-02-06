package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int id;
	
	private String nom;
	
	private String telephone;
	
	private String mail;
	
	private String mdp;

	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(String nom, String telephone, String mail, String mdp) {
		super();
		this.nom = nom;
		this.telephone = telephone;
		this.mail = mail;
		this.mdp = mdp;
	}

	public Client(int id, String nom, String telephone, String mail, String mdp) {
		super();
		this.id = id;
		this.nom = nom;
		this.telephone = telephone;
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
		return "Client [id=" + id + ", nom=" + nom + ", telephone=" + telephone + ", mail=" + mail + ", mdp=" + mdp
				+ "]";
	}
	
	
	
	
	

}
