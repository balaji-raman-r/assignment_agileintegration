package org.mycompany.service;

import java.util.HashMap;
import java.util.Map;

import org.mycompany.entities.Patient;
import org.springframework.stereotype.Component;

@Component(value = "patientService")

public class PatientService {
	
	public PatientService() {}
	
	public String get(String patientId) {
			System.out.println("Request came for Patient ID:"+ patientId);
			return "Request came for Patient ID:"+ patientId;
	}
	
	public  Map<String, Patient> getAll(){
		System.out.println("Get All Method call");
		Patient p1 = new Patient();
		p1.setId("123");
		p1.setName("Balaji");
		return (Map<String, Patient>) new HashMap().put("123",p1);		
	}
	
	
	
	public void add(Patient patient){
		
		System.out.println("Add Patient Request is received "+ patient.getId() + " Name:"+patient.getName());

	}
	
	
	
	public void update(String id){
		
		System.out.println("Update Patient Request is received"+id);
		
	}
}
