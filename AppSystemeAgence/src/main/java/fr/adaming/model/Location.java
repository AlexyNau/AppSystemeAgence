package fr.adaming.model;

import java.io.Serializable;

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

	public Location(double caution, double loyer, double charges, int bail, boolean garniture) {
		super();
		this.caution = caution;
		this.loyer = loyer;
		this.charges = charges;
		this.bail = bail;
		this.garniture = garniture;
	}
	
	
	
	

}
