package com.heathcare.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heathcare.dto.ApiResponse;
import com.heathcare.entities.Appointment;
import com.heathcare.entities.Doctor;
import com.heathcare.entities.Patient;
import com.heathcare.repository.AppointmentRepository;
import com.heathcare.repository.DoctorRepository;
import com.heathcare.repository.PatientRepositoty;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepo;
	
	@Autowired
	DoctorRepository docRepo;
	
	@Autowired
	PatientRepositoty patRepo;

	@Override
	public ApiResponse createAppointment(Long doctorId, Long patientId, LocalDateTime appointmentTime) {
		System.out.println(doctorId + "" + patientId);
		String mesg = "Invalid Patient or Doctor Id!";
		if (doctorId == null || patientId == null) {
            throw new IllegalArgumentException("Doctor ID and Patient ID must not be null!");
        }
		
		if (!isValidAppointmentTime(appointmentTime)) {
			return new ApiResponse("Appointment time must be in 30-minute intervals!");
//            throw new IllegalArgumentException("Appointment time must be in 30-minute intervals!");
        }
		
		Optional<Doctor> doctor = docRepo.findById(doctorId);
        Optional<Patient> patient = patRepo.findById(patientId);
        
        if(doctor.isPresent() && patient.isPresent()) {
        	Appointment appointment = new Appointment();
        	appointment.setDoctor(doctor.get());
        	appointment.setPatient(patient.get());
        	appointment.setAppointmentTime(appointmentTime);
        	appointment.setStatus("scheduled");
        	appointmentRepo.save(appointment);
        	mesg = "Appointment added successfully...";
        	return new ApiResponse(mesg);
        }
        
//		throw new ResourceNotFoundException("Invalid Patient or Doctor Id");
        return new ApiResponse(mesg);
	}
	
	private boolean isValidAppointmentTime(LocalDateTime appointmentTime) {
        int minutes = appointmentTime.getMinute();
        return minutes == 0 || minutes == 30;
    }
	
	@Override
	public List<Appointment> viewUpcomingAppointmentsForDoctor
	(Long doctorId){
		return appointmentRepo
				.findByDoctorIdAndAppointmentTimeAfter(doctorId, LocalDateTime.now());
	}

	@Override
	public ApiResponse cancelAppointment(Long appointmentId) {
		Optional<Appointment> appointment = appointmentRepo.findById(appointmentId);
		if(appointment.isPresent() && !(appointment.get().getStatus().equals("Cancelled"))) {
			appointment.get().setStatus("Cancelled");
			return new ApiResponse("Appointment Canceled!");
		}
		
		return new ApiResponse
				("Invalid Appointment Id Or Appointment already cancelled!");
	}
	
//	@Override
//    public List<Appointment> findByPatientIdAndAppointmentTimeAfter
//    (Long patientId, LocalDateTime dateTime){
//		return appointmentRepo
//				.findByPatientIdAndAppointmentTimeAfter(patientId, LocalDateTime.now());
//    	
//    }
}
