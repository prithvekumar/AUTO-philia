package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dealers {
	
	@Id
	private long did;
	private String dimg;
	private String dname;
	private String dbrand;
	private double dlat;
	private double dlng;
	private String daddress;
	private String dpnumber;
	
	public Dealers() {
	
	}

	public Dealers(long did, String daddress, String dbrand, String dimg, double dlat, double dlng, String dname,
			String dpnumber) {
		super();
		this.did = did;
		this.dimg = dimg;
		this.dname = dname;
		this.dbrand = dbrand;
		this.dlat = dlat;
		this.dlng = dlng;
		this.daddress = daddress;
		this.dpnumber = dpnumber;
	}

	public long getDid() {
		return did;
	}

	public void setDid(long did) {
		this.did = did;
	}

	public String getDimg() {
		return dimg;
	}

	public void setDimg(String dimg) {
		this.dimg = dimg;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDbrand() {
		return dbrand;
	}

	public void setDbrand(String dbrand) {
		this.dbrand = dbrand;
	}

	public double getDlat() {
		return dlat;
	}

	public void setDlat(double dlat) {
		this.dlat = dlat;
	}

	public double getDlng() {
		return dlng;
	}

	public void setDlng(double dlng) {
		this.dlng = dlng;
	}

	public String getDaddress() {
		return daddress;
	}

	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}

	public String getDpnumber() {
		return dpnumber;
	}

	public void setDpnumber(String dpnumber) {
		this.dpnumber = dpnumber;
	}

	@Override
	public String toString() {
		return "Dealers [did=" + did + ", dimg=" + dimg + ", dname=" + dname + ", dbrand=" + dbrand + ", dlat=" + dlat
				+ ", dlng=" + dlng + ", daddress=" + daddress + ", dpnumber=" + dpnumber + "]";
	}
	

}
