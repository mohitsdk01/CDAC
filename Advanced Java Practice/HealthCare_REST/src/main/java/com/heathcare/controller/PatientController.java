package com.heathcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heathcare.entities.Patient;
import com.heathcare.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@PostMapping
	public ResponseEntity<?> createPatientAccount(@RequestBody Patient patient){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(patientService.createPatientAccount(patient));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllPatient(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(patientService.getAllPatient());
	}
	
}
