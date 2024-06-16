package com.heathcare.service;

import java.util.List;

import com.heathcare.entities.Patient;

public interface PatientService {
	Patient createPatientAccount(Patient patient);
	List<Patient> getAllPatient();	
}
