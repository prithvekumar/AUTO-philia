package com.Cars.AUTOphilia.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Updates {
	
	@Id
	private int id;
	private String heading;
	private String body;
	
	
	public Updates() {
		
	}

	
	public Updates(int id, String body, String heading) {
		super();
		this.id = id;
		this.heading = heading;
		this.body = body;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getHeading() {
		return heading;
	}


	public void setHeading(String heading) {
		this.heading = heading;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	@Override
	public String toString() {
		return "Updates [Id=" + id + ", heading=" + heading + ", body=" + body + "]";
	}

	
	
}
