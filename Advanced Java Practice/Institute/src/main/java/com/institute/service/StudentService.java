package com.institute.service;

import com.institute.dto.ApiResponse;
import com.institute.entities.Student;

public interface StudentService {

	ApiResponse addStudent(Long courseId,Student student);

}
