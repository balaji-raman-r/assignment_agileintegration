package com.nextgate.ws.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.mycompany.entities.Patient;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "callerInfo", propOrder = {
    "application",
    "applicationFunction",
    "authPassword",
    "authUser",
    "executionCycleId",
    "system",
    "user"
})
public class CallerInfo {

    protected String application;
    protected String applicationFunction;
    protected String authPassword;
    protected String authUser;
    protected String executionCycleId;
    protected String system;
    protected String user;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the applicationFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationFunction() {
        return applicationFunction;
    }

    /**
     * Sets the value of the applicationFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationFunction(String value) {
        this.applicationFunction = value;
    }

    /**
     * Gets the value of the authPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthPassword() {
        return authPassword;
    }

    /**
     * Sets the value of the authPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthPassword(String value) {
        this.authPassword = value;
    }

    /**
     * Gets the value of the authUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthUser() {
        return authUser;
    }

    /**
     * Sets the value of the authUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthUser(String value) {
        this.authUser = value;
    }

    /**
     * Gets the value of the executionCycleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionCycleId() {
        return executionCycleId;
    }

    /**
     * Sets the value of the executionCycleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionCycleId(String value) {
        this.executionCycleId = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }
    
    
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Patient)) {
            return false;
        }
        
        
       CallerInfo callerInfo = (CallerInfo) o;
        
       return new EqualsBuilder()
                .append(applicationFunction, callerInfo.applicationFunction)
                .append(authPassword, callerInfo.authPassword)
                .append(authUser, callerInfo.authUser)
                .append(executionCycleId, callerInfo.executionCycleId)
                .append(system, callerInfo.system)
                .append(user, callerInfo.user)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
        		.append(applicationFunction)
        		.append(authPassword)
        		.append(authUser)
        		.append(executionCycleId)
        		.append(system)
        		.append(user)
                .toHashCode();
    }
	
	
	
	@Override
    public String toString() {
		return "CallerInfo - ApplicationFunction:"+applicationFunction+
					" AuthPassword:"+authPassword+
					" AuthUser:"+authUser+
					" ExecutionCycleId:"+executionCycleId+
					" System:"+system+
					" User:"+user;					
					
	}
    

}
