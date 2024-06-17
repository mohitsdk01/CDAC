package com.heathcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heathcare.entities.Doctor;
import com.heathcare.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	@Autowired
	DoctorService docService;
	
	@PostMapping
	public ResponseEntity<?> createDoctorAccount(@RequestBody Doctor doctor){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(docService.createDoctorAccount(doctor));
	}
	
	@GetMapping
	public ResponseEntity<?> getAllDoctor(){
		return ResponseEntity.status(HttpStatus.OK)
				.body(docService.getAllDoctors());
	}
}
