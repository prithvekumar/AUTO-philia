package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Valuate {
	
	@Id
	@GeneratedValue
	private int id;
	 private String personname;
	 private String brandname;
	 private String modelname;
	 private String variant;
	 private double km;
	 private String ph;
	 private String location;
	 private String state;
	 
	public Valuate() {
		
	}

	public Valuate(int id, String brandname, double km,String location, String modelname,
			String personname, String ph, String state, String variant) {
		super();
		this.id = id;
		this.personname = personname;
		this.brandname = brandname;
		this.modelname = modelname;
		this.variant = variant;
		this.km = km;
		this.ph = ph;
		this.location = location;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Valuate [id=" + id + ", personname=" + personname + ", brandname=" + brandname + ", modelname="
				+ modelname + ", variant=" + variant + ", km=" + km + ", ph=" + ph + ", location=" + location
				+ ", state=" + state + "]";
	}


	
}
