package com.heathcare.service;

import java.time.LocalDateTime;
import java.util.List;

import com.heathcare.dto.ApiResponse;
import com.heathcare.entities.Appointment;

public interface AppointmentService {
	ApiResponse createAppointment
	(Long doctorId, Long patientId, LocalDateTime appointmentTime);
	
	List<Appointment> viewUpcomingAppointmentsForDoctor
	(Long doctorId);

	ApiResponse cancelAppointment(Long appointmentId);
	
//	List<Appointment> findByPatientIdAndAppointmentTimeAfter
//    (Long patientId, LocalDateTime dateTime);
//	Appointment createAppointment(Appointment appointment);
}
