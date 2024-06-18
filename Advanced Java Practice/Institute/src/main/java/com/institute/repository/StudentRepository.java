package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institute.entities.Student;
import com.institute.entities.Course;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
	List<Student> findByCourse(Course course);
}
