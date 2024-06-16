package com.heathcare.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heathcare.entities.Patient;
import com.heathcare.repository.PatientRepositoty;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepositoty patientRepo;
	
	@Override
	public Patient createPatientAccount(Patient patient) {
		return patientRepo.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		return patientRepo.findAll();
	}

}
