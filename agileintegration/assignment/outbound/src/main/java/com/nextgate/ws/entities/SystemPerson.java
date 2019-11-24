package com.nextgate.ws.entities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.mycompany.entities.Patient;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemPerson", propOrder = {
    "createDateTime",
    "createFunction",
    "createUser",
    "localId",
    "person",
    "status",
    "systemCode",
    "systemCodeDescription",
    //"uniqueId",
    "updateDateTime",
    "updateFunction",
    "updateUser",
    "firstName",
    "lastName",
    "phone",
    "state",
    "streetAddr",
    "zip",
    "city"
})

public class SystemPerson {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    protected String createFunction;
    protected String createUser;
    protected String localId;
    protected PersonBean person;
    protected String status;
    protected String systemCode;
    protected String systemCodeDescription;
   /* @XmlElement(nillable = true)
    protected List<SystemObjectUIDBean> uniqueId;*/
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;
    protected String updateFunction;
    protected String updateUser;

    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String state;
    protected String streetAddr;
    protected String zip;
    protected String city;
    
    
    /**
     * Gets the value of the createDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * Sets the value of the createDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * Gets the value of the createFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateFunction() {
        return createFunction;
    }

    /**
     * Sets the value of the createFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateFunction(String value) {
        this.createFunction = value;
    }

    /**
     * Gets the value of the createUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Sets the value of the createUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateUser(String value) {
        this.createUser = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link PersonBean }
     *     
     */
    public PersonBean getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonBean }
     *     
     */
    public void setPerson(PersonBean value) {
        this.person = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

    /**
     * Gets the value of the systemCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCodeDescription() {
        return systemCodeDescription;
    }

    /**
     * Sets the value of the systemCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCodeDescription(String value) {
        this.systemCodeDescription = value;
    }

    /**
     * Gets the value of the uniqueId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uniqueId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniqueId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemObjectUIDBean }
     * 
     * 
     */
 

    /**
     * Gets the value of the updateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

    /**
     * Gets the value of the updateFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateFunction() {
        return updateFunction;
    }

    /**
     * Sets the value of the updateFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateFunction(String value) {
        this.updateFunction = value;
    }

    /**
     * Gets the value of the updateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }
    
    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Patient)) {
            return false;
        }
        
        
        
      
        
        
        
        
        SystemPerson systemPerson = (SystemPerson) o;
        
       return new EqualsBuilder()
                .append(createDateTime, systemPerson.createDateTime)
                .append(createFunction, systemPerson.createFunction)
                .append(createUser, systemPerson.createUser)
                .append(localId, systemPerson.localId)
                .append(person, systemPerson.person)
                .append(status, systemPerson.status)
                
                .append(systemCode, systemPerson.systemCode)
                .append(systemCodeDescription, systemPerson.systemCodeDescription)
                .append(updateDateTime, systemPerson.updateDateTime)
                .append(localId, systemPerson.localId)
                .append(updateFunction, systemPerson.updateFunction)
                .append(updateUser, systemPerson.updateUser)
                .append(firstName, systemPerson.firstName)
                .append(lastName, systemPerson.lastName)
                .append(phone, systemPerson.phone)
                .append(state, systemPerson.state)
                .append(streetAddr, systemPerson.streetAddr)
                .append(zip, systemPerson.zip)
                .append(city,systemPerson.city)  
                
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
        		.append(createDateTime)
        		.append(createFunction)
        		.append(createUser)
        		.append(localId)
        		.append(person)
        		.append(status)
        		.append(systemCode)
        		.append(systemCodeDescription)
        		.append(updateDateTime)
        		.append(localId)
        		.append(updateFunction)
        		.append(updateUser)
        		.append(firstName)
                .append(lastName)
                .append(phone)
                .append(state)
                .append(streetAddr)
                .append(zip)
                .append(city)
                .toHashCode();
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

	@Override
    public String toString() {
		return "SystemPerson - createUser:"+createUser;					
					
	}

}
