package com.institute.service;

import java.util.List;

import com.institute.dto.ApiResponse;
import com.institute.entities.Course;


public interface CourseService {

	ApiResponse addCourse(Course course);

	ApiResponse updateCourse(Long courseId, Course course);

	List<Course> findAllCoursesByCourseName(String courseName);

}
