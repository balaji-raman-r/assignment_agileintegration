package com.nextgate.ws.entities;


import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "account")

public class Account {

    private int clientId;
    public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getSalesRepresentative() {
		return salesRepresentative;
	}

	public void setSalesRepresentative(String salesRepresentative) {
		this.salesRepresentative = salesRepresentative;
	}

	private String salesRepresentative;
    /**
     * 
     * (Required)
     * 
     */
    private Company company;
    /**
     * 
     * (Required)
     * 
     */
    private Contact contact;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * 
     * (Required)
     * 
     * @param company
     *     The company
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * 
     * (Required)
     * 
     * @param contact
     *     The contact
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
