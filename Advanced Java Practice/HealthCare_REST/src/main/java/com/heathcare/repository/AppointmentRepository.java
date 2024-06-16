package com.heathcare.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heathcare.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	List<Appointment> findByDoctorIdAndAppointmentTimeAfter
	(Long doctorId, LocalDateTime dateTime);
    List<Appointment> findByPatientIdAndAppointmentTimeAfter
    (Long patientId, LocalDateTime dateTime);
}
