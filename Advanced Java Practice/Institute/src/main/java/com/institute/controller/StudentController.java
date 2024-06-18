package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entities.Student;
import com.institute.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	StudentService studService;
	
	@PostMapping("/{courseId}")
	@Operation(summary = "Adding the Student")
	public ResponseEntity<?> addStudent(@PathVariable Long courseId, @RequestBody Student student){
		return ResponseEntity.status(HttpStatus.CREATED)
		.body(studService.addStudent(courseId,student));
	}
	
	@GetMapping("/getStudents")
	public List<Student> getAllStudentsOfSpecificCourse(@RequestParam String name){
		return studService.getAllStudentsOfSpecificCourse(name);
	}
}
