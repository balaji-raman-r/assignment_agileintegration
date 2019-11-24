package com.nextgate.ws.entities;

public class PatientNew {

	String name;
	String id;
	public PatientNew() {
		System.out.println("Patient Object Instantiated now...");
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		return "PatienID:"+id+" Name:"+name;
	}
	
	
}
