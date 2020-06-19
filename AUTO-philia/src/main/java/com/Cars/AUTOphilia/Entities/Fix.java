package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fix {
	
	@Id
	@GeneratedValue
	private int id;
	private String brandname;
	 private String location;
	 private String modelname;
	 private String personname;
	 private String ph;
	 private String problem;
	 private String state;
	 private String variant;
	 
	public Fix() {
		
	}

	public Fix(int id, String brandname, String location, String modelname, String personname, String ph,
			String problem, String state, String variant) {
		super();
		this.id = id;
		this.brandname = brandname;
		this.location = location;
		this.modelname = modelname;
		this.personname = personname;
		this.ph = ph;
		this.problem = problem;
		this.state = state;
		this.variant = variant;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	@Override
	public String toString() {
		return "Fix [id=" + id + ", brandname=" + brandname + ", location=" + location + ", modelname=" + modelname
				+ ", personname=" + personname + ", ph=" + ph + ", problem=" + problem + ", state=" + state
				+ ", variant=" + variant + "]";
	}
	
	
	
	 
}
