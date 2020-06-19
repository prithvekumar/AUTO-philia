package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cars {
	
	@Id
	private long acarid;
	private String aname;
	private String aimage;
	private String abrand;
	private String amodel;
	private double aprice;
	private String atransmission;
	private int acolors;
	private int aenginetypes;
	private String adescription;
	
	public Cars() {
	
	}
	
	public Cars(long acarid, String abrand, int acolors, String adescription, int aenginetypes, String aimage,
			String amodel, String aname, double aprice, String atransmission) {
		super();
		this.acarid = acarid;
		this.aname = aname;
		this.aimage = aimage;
		this.abrand = abrand;
		this.amodel = amodel;
		this.aprice = aprice;
		this.atransmission = atransmission;
		this.acolors = acolors;
		this.aenginetypes = aenginetypes;
		this.adescription = adescription;
		
	}
	
	
	public long getAcarid() {
		return acarid;
	}
	public void setAcarid(long acarid) {
		this.acarid = acarid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAimage() {
		return aimage;
	}
	public void setAimage(String aimage) {
		this.aimage = aimage;
	}
	public String getAbrand() {
		return abrand;
	}
	public void setAbrand(String abrand) {
		this.abrand = abrand;
	}
	public String getAmodel() {
		return amodel;
	}
	public void setAmodel(String amodel) {
		this.amodel = amodel;
	}
	public double getAprice() {
		return aprice;
	}
	public void setAprice(double aprice) {
		this.aprice = aprice;
	}
	public String getAtransmission() {
		return atransmission;
	}
	public void setAtransmission(String atransmission) {
		this.atransmission = atransmission;
	}
	public int getAcolors() {
		return acolors;
	}
	public void setAcolors(int acolors) {
		this.acolors = acolors;
	}
	public int getAenginetypes() {
		return aenginetypes;
	}
	public void setAenginetypes(int aenginetypes) {
		this.aenginetypes = aenginetypes;
	}
	public String getAdescription() {
		return adescription;
	}
	public void setAdescription(String adescription) {
		this.adescription = adescription;
	}
	@Override
	public String toString() {
		return "Cars [acarid=" + acarid + ", aname=" + aname + ", aimage=" + aimage + ", abrand=" + abrand + ", amodel="
				+ amodel + ", aprice=" + aprice + ", atransmission=" + atransmission + ", acolors=" + acolors
				+ ", aenginetypes=" + aenginetypes + ", adescription=" + adescription + "]";
	}
	
	
}
