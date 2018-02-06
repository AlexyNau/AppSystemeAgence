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
@Table(name="locations")
public class Location extends BienImmobilier implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_l")
	private int id;
	private double caution;
	private double loyer;
	private double charges;
	private int bail;
	private boolean garniture;
	
	public Location() {
		super();
	}

	public Location(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			double caution, double loyer, double charges, int bail, boolean garniture) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise);
		this.caution = caution;
		this.loyer = loyer;
		this.charges = charges;
		this.bail = bail;
		this.garniture = garniture;
	}
	
	public Location(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			Adresse adresse, double caution, double loyer, double charges, int bail, boolean garniture) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise, adresse);
		this.caution = caution;
		this.loyer = loyer;
		this.charges = charges;
		this.bail = bail;
		this.garniture = garniture;
	}

	public Location(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			int id, double caution, double loyer, double charges, int bail, boolean garniture) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise);
		this.id = id;
		this.caution = caution;
		this.loyer = loyer;
		this.charges = charges;
		this.bail = bail;
		this.garniture = garniture;
	}

	public Location(String statut, Date datePublication, Date dateDisponibilite, double revenuCadastral, double remise,
			Adresse adresse, int id, double caution, double loyer, double charges, int bail, boolean garniture) {
		super(statut, datePublication, dateDisponibilite, revenuCadastral, remise, adresse);
		this.id = id;
		this.caution = caution;
		this.loyer = loyer;
		this.charges = charges;
		this.bail = bail;
		this.garniture = garniture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCaution() {
		return caution;
	}

	public void setCaution(double caution) {
		this.caution = caution;
	}

	public double getLoyer() {
		return loyer;
	}

	public void setLoyer(double loyer) {
		this.loyer = loyer;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public int getBail() {
		return bail;
	}

	public void setBail(int bail) {
		this.bail = bail;
	}

	public boolean isGarniture() {
		return garniture;
	}

	public void setGarniture(boolean garniture) {
		this.garniture = garniture;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", caution=" + caution + ", loyer=" + loyer + ", charges=" + charges + ", bail="
				+ bail + ", garniture=" + garniture + "]";
	}


}
