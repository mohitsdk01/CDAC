package cdac.exam.b2.utils;

import java.time.LocalDate;
import java.util.Map;

import cdac.exam.b2.core.Course;
import cdac.exam.b2.core.Frequency;
import cdac.exam.b2.exceptions.CourseException;

import static java.time.LocalDate.parse;
import cdac.exam.b2.core.Status;

public class Validations {
	
	public static Course validateInput(String title, double fees, double discount, String sDate,
			String eDate, String freq, String status, 
			String updateDate, Map<Integer, Course> courseMap) 
					throws CourseException {
		
		courseDateValidator(sDate, eDate);
		Frequency freq1 = Frequency.valueOf(freq);
		if(freq1.equals(Frequency.valueOf("WEEKEND_ONLY".toUpperCase()))) {
			weekendBatchValidation(sDate);
		}
		
		return new Course(title, fees, discount, parse(sDate), parse(eDate), Frequency.valueOf(freq.toUpperCase()), Status.valueOf(status), parse(updateDate));
	}

	private static void weekendBatchValidation(String sDate) throws CourseException {
		if(!(parse(sDate).getDayOfWeek().toString().equals("SATURDAY") 
				|| parse(sDate).getDayOfWeek().toString().equals("SUNDAY"))) {
			throw new CourseException(sDate + " Day Is Invalid!");
		}
		
	}

	private static void courseDateValidator(String sDate, String eDate)
			throws CourseException {
		if(parse(sDate).isAfter(parse(eDate))) {
			throw new CourseException(eDate + " is Invalid please enter date before the End Date!");
		}
	}
}
