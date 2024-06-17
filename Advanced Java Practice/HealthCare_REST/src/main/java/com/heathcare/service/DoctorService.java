package com.heathcare.service;

import java.util.List;

import com.heathcare.entities.Doctor;

public interface DoctorService {
	Doctor createDoctorAccount(Doctor doctor);
	List<Doctor> getAllDoctors();
}
