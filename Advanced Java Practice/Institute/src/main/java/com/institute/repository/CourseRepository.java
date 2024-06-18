package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institute.entities.Course;
import java.lang.String;
import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
	List<Course> findByName(String name);
}
