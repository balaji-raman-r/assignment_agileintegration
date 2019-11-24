package com.nextgate.ws.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)

public class Company {

    /**
     * 
     * (Required)
     * 
     */
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    private String geo;
    /**
     * 
     * (Required)
     * 
     */
    private boolean active;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The geo
     */
    //@JsonProperty("geo")
    public String getGeo() {
        return geo;
    }

    /**
     * 
     * (Required)
     * 
     * @param geo
     *     The geo
     */
    //@JsonProperty("geo")
    public void setGeo(String geo) {
        this.geo = geo;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The active
     */
    //@JsonProperty("active")
    public boolean isActive() {
        return active;
    }

    /**
     * 
     * (Required)
     * 
     * @param active
     *     The active
     */
    //@JsonProperty("active")
    public void setActive(boolean active) {
        this.active = active;
    }

}
