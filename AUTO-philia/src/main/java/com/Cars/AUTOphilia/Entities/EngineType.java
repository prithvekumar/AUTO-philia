package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EngineType {

	@Id
	@GeneratedValue
	private int Id;
	private long Carid;
	private String Enginetype;
	private String Maxpower;
	private String Maxtorque;
	
	
	
	public EngineType() {
		
	}
	public EngineType(int id, long carid, String enginetype, String maxpower, String maxtorque) {
		super();
		Id = id;
		Carid = carid;
		Enginetype = enginetype;
		Maxpower = maxpower;
		Maxtorque = maxtorque;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public long getCarid() {
		return Carid;
	}
	public void setCarid(long carid) {
		Carid = carid;
	}
	public String getEnginetype() {
		return Enginetype;
	}
	public void setEnginetype(String enginetype) {
		Enginetype = enginetype;
	}
	public String getMaxpower() {
		return Maxpower;
	}
	public void setMaxpower(String maxpower) {
		Maxpower = maxpower;
	}
	public String getMaxtorque() {
		return Maxtorque;
	}
	public void setMaxtorque(String maxtorque) {
		Maxtorque = maxtorque;
	}
	@Override
	public String toString() {
		return "EngineType [Id=" + Id + ", Carid=" + Carid + ", Enginetype=" + Enginetype + ", Maxpower=" + Maxpower
				+ ", Maxtorque=" + Maxtorque + "]";
	}
	
}
