package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entities.Course;
import com.institute.service.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping
	public ResponseEntity<?> addCourse(@RequestBody Course course){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(courseService.addCourse(course));
	}
	
	@PatchMapping("/{courseId}")
	public ResponseEntity<?> updateCourseDetails(@PathVariable Long courseId ,@RequestBody Course course){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(courseService.updateCourse(courseId ,course));
	}
	
	@GetMapping
	public List<Course> findAllCoursesByCourseName(@RequestParam String courseName){
		return courseService.findAllCoursesByCourseName(courseName);
	}
}
