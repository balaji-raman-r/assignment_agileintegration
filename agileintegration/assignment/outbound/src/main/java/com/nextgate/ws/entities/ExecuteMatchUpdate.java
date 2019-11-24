package com.nextgate.ws.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.mycompany.entities.Patient;


/**
 * <p>Java class for executeMatchUpdate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="executeMatchUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="callerInfo" type="{http://webservice.index.mdm.sun.com/}callerInfo" minOccurs="0"/&gt;
 *         &lt;element name="sysObjBean" type="{http://webservice.index.mdm.sun.com/}systemPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "executeMatchUpdate", propOrder = {
    "callerInfo",
    "sysObjBean"
})

*/

@XmlRootElement
public class ExecuteMatchUpdate {

    protected CallerInfo callerInfo;
    protected SystemPerson sysObjBean;

    /**
     * Gets the value of the callerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CallerInfo }
     *     
     */
    public CallerInfo getCallerInfo() {
        return callerInfo;
    }

    /**
     * Sets the value of the callerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallerInfo }
     *     
     */
    public void setCallerInfo(CallerInfo value) {
        this.callerInfo = value;
    }

    /**
     * Gets the value of the sysObjBean property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPerson }
     *     
     */
    public SystemPerson getSysObjBean() {
        return sysObjBean;
    }

    /**
     * Sets the value of the sysObjBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPerson }
     *     
     */
    public void setSysObjBean(SystemPerson value) {
        this.sysObjBean = value;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Patient)) {
            return false;
        }
        
        ExecuteMatchUpdate executeMatchUpdate = (ExecuteMatchUpdate) o;
      
       return new EqualsBuilder()		   
    	.append(callerInfo, executeMatchUpdate.callerInfo)
    	.append(sysObjBean, executeMatchUpdate.sysObjBean)           
        .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
        		.append(callerInfo)
        		.append(sysObjBean)
                .toHashCode();
    }	
	
	@Override
    public String toString() {
		return "ExecuteMatchUpdate - callerInfo:"+callerInfo + " sysObjBean:"+sysObjBean;
					
	}
    
}

