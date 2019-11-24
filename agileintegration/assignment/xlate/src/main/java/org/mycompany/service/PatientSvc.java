package org.mycompany.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.mycompany.entities.Patient;

@Path("/patients/") 
@Consumes(value = "application/xml,application/json") 
@Produces(value = "application/xml,application/json")

public interface PatientSvc {
	
	@GET
	@Path ("/{id}")
	Patient getPatient(@PathParam("id") int patientId);
	
	@PUT
	void updatePatient(Patient patient);
	
	@POST
	String addPatient(Patient patient);

}
