package cdac.exam.b2.utils;

import java.util.Map;
import java.util.Scanner;

import cdac.exam.b2.core.Course;
import cdac.exam.b2.core.Frequency;
import cdac.exam.b2.exceptions.CourseException;
import cdac.exam.b2.core.Status;
import static java.time.LocalDate.parse;

import java.time.LocalDate;

import static cdac.exam.b2.utils.Validations.validateInput;

public class Utility {
	
	// Plan(Create New Course).
	public static void planNewCourse(Map<Integer, Course> courseMap, Scanner sc) 
			throws CourseException {
		System.out.println("Enter Course Details: "
				+ "[Title, Fees, Discount, Start Date, End Date, Frequency, Status, Update Date] ");
		Course course = validateInput(sc.next(), sc.nextDouble(), sc.nextDouble(),sc.next(), 
				sc.next(), sc.next(), 
				sc.next(), sc.next(), courseMap);
		courseMap.put(course.getCourseId(), course);
		System.out.println("Course Added Successfully.");
	}
	
	// Update Course
	public static void updateCourse(Map<Integer, Course> courseMap, Scanner sc) 
			throws CourseException {
		System.out.println("Enter Course ID to update the Course: ");
		int courseId = sc.nextInt();
		Course course = courseMap.get(courseId);
		updateCourse(course, courseId, courseMap, sc);
		System.out.println("Course Updated Successfully.");
	}
	
	
	// Discount of 20% on Weekend Courses
	public static void discountOnCourse(Map<Integer, Course> courseMap, Scanner sc) 
			throws CourseException {
		
		for(Course course : courseMap.values()) {
			if(course.getFreq().equals(Frequency.valueOf("WEEKEND_ONLY"))) {
				
				if(course.getStartDate().isAfter(course.getStartDate().plusMonths(1))) {
					course.setDiscount(20.0);
				}
			}
		}
		System.out.println("20% Discount Settled.");
	}
	
	// Cancel Short Term Courses for next year.
	public static void cancelShortTimeCourses(Map<Integer, Course> courseMap, Scanner sc) 
			throws CourseException {
		for(Course course : courseMap.values()) {
			int month1 =course.getEndDate().getMonthValue();
			int month2 = course.getStartDate().getMonthValue();
			int currYear = LocalDate.now().getYear();
			if((course.getStartDate().getYear() > currYear) && (month1 == month2)) {
				courseMap.remove(course.getCourseId());
			}
		}
		System.out.println("Courses Removed...");
	}

	
	private static void updateCourse(Course course, int courseId, 
			Map<Integer, Course> courseMap, Scanner sc) {
		boolean exit = false;
		
		do {
			System.out.println("Menu: \n");
			System.out.println("1. Update Schedule \n"
					+ "2. Update Fees. \n"
					+ "3.Update Status \n"
					+ "4. Exit\n");
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter New End Date: ");
				String eDate = sc.next();
				course.setEndDate(parse(eDate));
				System.out.println("Date Updated Successfully.");
				break;
			case 2:
				System.out.println("Enter New Fees: ");
				double fees = sc.nextDouble();
				course.setFees(fees);
				break;
			case 3:
				System.out.println("Enter New Status: ");
				String status = sc.next();
				course.setStatus(Status.valueOf(status.toUpperCase()));
				break;
			case 4:
				exit = true;
				break;
			}
		}while(!exit);
		
	}
	
}
