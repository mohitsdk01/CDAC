package com.institute.service;

import java.util.List;

import com.institute.dto.ApiResponse;
import com.institute.entities.Student;

public interface StudentService {

	ApiResponse addStudent(Long courseId,Student student);

	List<Student> getAllStudentsOfSpecificCourse(String name);

}
