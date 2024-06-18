package com.institute.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.custom_exceptions.CustomException;
import com.institute.dto.ApiResponse;
import com.institute.entities.Course;
import com.institute.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseRepository courseRepo;
	
	
	@Override
	public ApiResponse addCourse(Course course) {
		String msg = "Course Addition Failed!";
		if(course != null && course.getStartDate().isAfter(course.getEndDate())) {
			throw new CustomException("Start date must be before end date!!!");
		}
		else {
			courseRepo.save(course);
			msg = "Course Addition Successful.";
		}
		return new ApiResponse(msg);
	}


	@Override
	public ApiResponse updateCourse(Long courseId, Course course) {
		String msg = "Update Failed!";
		Course course1 = courseRepo.findById(courseId).orElse(null);
		if(course != null && course.getStartDate().isAfter(course.getEndDate())) {
			throw new CustomException("Start date must be before end date!!!");
		}else {
			course1.setStartDate(course.getStartDate());
			course1.setEndDate(course.getEndDate());;
			course1.setFees(course.getFees());
			courseRepo.save(course1);
			msg = "Update Successful!";
		}
		return new ApiResponse(msg);
	}


	@Override
	public List<Course> findAllCoursesByCourseName(String courseName) {
		return courseRepo.findByName(courseName);
	}

}
