package com.heathcare.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heathcare.entities.Doctor;
import com.heathcare.entities.Patient;

public interface PatientRepositoty extends JpaRepository<Patient, Long> {

//	Optional<Patient> findByPatient(Patient patient);
	Optional<Patient> findById(Long id);
}