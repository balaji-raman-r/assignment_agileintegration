package org.mycompany.entities.converter;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.mycompany.entities.Patient;

import com.nextgate.ws.entities.CallerInfo;
import com.nextgate.ws.entities.ExecuteMatchUpdate;
import com.nextgate.ws.entities.SystemPerson;

@Converter
public class ExecuteMatchUpdateConverter {
	@Converter
    public static ExecuteMatchUpdate toExecuteMatchUpdate(Patient patient, Exchange exchange) {
      	
        ExecuteMatchUpdate executeMatchUpdate = new ExecuteMatchUpdate();        
        CallerInfo callerInfo = new CallerInfo();
        callerInfo.setUser("user_"+patient.getId());
        SystemPerson systemPerson = new SystemPerson();
        systemPerson.setLocalId(patient.getId());
        systemPerson.setFirstName(patient.getFirstName());
        systemPerson.setLastName(patient.getLastName());
        systemPerson.setPhone(patient.getPhone());
        systemPerson.setState(patient.getState());
        systemPerson.setStreetAddr(patient.getStreetAddr());
        systemPerson.setZip(patient.getZip());
        systemPerson.setCity(patient.getCity());
      
        executeMatchUpdate.setCallerInfo(callerInfo);
        executeMatchUpdate.setSysObjBean(systemPerson);

        return executeMatchUpdate;
    }
}
