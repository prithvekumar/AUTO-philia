package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Colors {

	@Id
	@GeneratedValue
	private int Id;
	private long Carid;
	private String Color;
	
	
	public Colors() {
		
	}
	public Colors(int id, long carid, String color) {
		super();
		Id = id;
		Carid = carid;
		Color = color;
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
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	@Override
	public String toString() {
		return "Colors [Id=" + Id + ", Carid=" + Carid + ", Color=" + Color + "]";
	}
	

	
}
