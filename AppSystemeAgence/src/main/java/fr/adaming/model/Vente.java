package fr.adaming.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ventes")
public class Vente extends BienImmobilier {

	// Les attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vente")
	private int id;
	private double prixAchat;
	private String etat; // Soit : à restaurer, correct, impeccable

	// Constructeurs
	public Vente() {
		super();
	}

	public Vente(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			double prixAchat, String etat) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise);
		this.prixAchat = prixAchat;
		this.etat = etat;
	}

	public Vente(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			int id, double prixAchat, String etat) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise);
		this.id = id;
		this.prixAchat = prixAchat;
		this.etat = etat;
	}

	public Vente(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			Adresse adresse, int id, double prixAchat, String etat) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise, adresse);
		this.id = id;
		this.prixAchat = prixAchat;
		this.etat = etat;
	}

	public Vente(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			Adresse adresse, double prixAchat, String etat) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise, adresse);
		this.prixAchat = prixAchat;
		this.etat = etat;
	}

	// Getters et setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(double prixAchat) {
		this.prixAchat = prixAchat;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Vente [id=" + id + ", prixAchat=" + prixAchat + ", etat=" + etat + "]";
	}

}
