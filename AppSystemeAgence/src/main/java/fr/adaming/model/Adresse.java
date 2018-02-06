package fr.adaming.model;

import java.io.Serializable;

@Embeddable
public class Adresse implements Serializable {
	
	private String rue;
	private int numero;
	private String ville;
	private String pays;
	
	
	public Adresse() {
		super();
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	

}
