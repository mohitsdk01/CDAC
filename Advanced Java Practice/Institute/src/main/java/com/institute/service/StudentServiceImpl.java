package com.institute.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.institute.dto.ApiResponse;
import com.institute.entities.Course;
import com.institute.entities.Student;
import com.institute.repository.CourseRepository;
import com.institute.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studRepo;
	
	@Autowired
	CourseRepository courseRepo;
	
	// not recommended(need to improve)(Fetch Course by name if no list)
	@Override
	public ApiResponse addStudent(Long courseId,Student student) {
		String msg = "Student Addition failed!";
		if(student != null) {
			Course course = courseRepo.findById(courseId).orElse(null);
			if(course != null) {
				Student student1 = new Student();
				student1.setCourse(course);
				student1.setEmail(student.getEmail());
				student1.setPassword(student.getPassword());
				student1.setStudentName(student.getStudentName());
				studRepo.save(student1);
				msg = "Student addition Successful!";
			}
		}
		return new ApiResponse(msg);
	}

	@Override
	public List<Student> getAllStudentsOfSpecificCourse(String name) {
		courseRepo.findByName(name);
		return studRepo.findAllByCourse(name);
	}

}
