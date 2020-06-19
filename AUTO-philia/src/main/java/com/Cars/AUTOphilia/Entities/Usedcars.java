package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usedcars {
	
	@Id
	private long id;
	private String img;
	private String name;
	private String model;
	private String brand;
	private double price;
	private String owner;
	private String loc;
	private double lat;
	private double lng;
	private String color;
	private String variant;
	private String phno;
	
	public Usedcars() {

	}

	public Usedcars(long id, String brand, String color, String img, double lat, double lng, String loc, String model
			,String name, String owner,String phno, double price, String variant) {
		super();
		this.id = id;
		this.img = img;
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.owner = owner;
		this.loc = loc;
		this.lat = lat;
		this.lng = lng;
		this.color = color;
		this.variant = variant;
		this.phno = phno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Usedcars [id=" + id + ", img=" + img + ", name=" + name + ", model=" + model + ", brand=" + brand
				+ ", price=" + price + ", owner=" + owner + ", loc=" + loc + ", lat=" + lat + ", lng=" + lng
				+ ", color=" + color + ", variant=" + variant + ", phno=" + phno + "]";
	}

	
}
