package com.heathcare.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heathcare.service.AppointmentService;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {
	
	@Autowired
	AppointmentService service;
	
	public AppointmentController() {
		System.out.println("in ctor " + getClass());
	}
	
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	@PostMapping
	public ResponseEntity<?> createAppointment
	(@RequestParam Long doctorId, @RequestParam Long patientId, @RequestParam String appointmentTime) {
		System.out.println("in create controller");
		LocalDateTime time = LocalDateTime.parse(appointmentTime, formatter);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(service.createAppointment(doctorId, patientId, time));
	}
	
	@GetMapping("/doctor/{doctorId}")
	public ResponseEntity<?> findByDoctorIdAndAppointmentTimeAfter(@PathVariable Long doctorId){
		return ResponseEntity.status(HttpStatus.OK)
				.body(service.viewUpcomingAppointmentsForDoctor(doctorId));
		
	}
	
	@PostMapping("appointment/{appointmentId}")
	public ResponseEntity<?> cancelAppointment(@PathVariable Long appointmentId){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(service.cancelAppointment(appointmentId));
	}
	
}