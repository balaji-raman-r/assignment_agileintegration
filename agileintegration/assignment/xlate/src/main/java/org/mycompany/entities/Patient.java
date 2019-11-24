package org.mycompany.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@XmlRootElement(name = "patient")
@XmlAccessorType(XmlAccessType.FIELD)
public class Patient {
	String name;
	String id;
	String firstName;
	String lastName;
	String phone;
	String state;
	String streetAddr;
	String zip;
	String city;
	public Patient() {
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
	
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Patient)) {
            return false;
        }

        Patient patient = (Patient) o;

        return new EqualsBuilder()
                .append(id, patient.id)
                .append(name, patient.name)
                .append(firstName, patient.firstName)
                .append(lastName, patient.lastName)
                .append(phone, patient.phone)
                .append(state, patient.state)
                .append(streetAddr, patient.streetAddr)
                .append(zip, patient.zip)
                .append(city,patient.city)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(firstName)
                .append(lastName)
                .append(phone)
                .append(state)
                .append(streetAddr)
                .append(zip)
                .append(city)
                .toHashCode();
    }
	
	
	
	public String toString() {
		return "PatienID:"+id+" Name:"+name;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the streetAddr
	 */
	public String getStreetAddr() {
		return streetAddr;
	}


	/**
	 * @param streetAddr the streetAddr to set
	 */
	public void setStreetAddr(String streetAddr) {
		this.streetAddr = streetAddr;
	}


	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}


	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
