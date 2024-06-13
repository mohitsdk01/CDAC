package cdac.exam.b2.utils;

import java.util.Map;
import java.util.HashMap;
import cdac.exam.b2.core.Course;
import cdac.exam.b2.core.Frequency;
import cdac.exam.b2.core.Status;

import static java.time.LocalDate.parse;

public class populateData {
	public static Map<Integer, Course> populateCourseMap(){
		Map<Integer, Course> courseMap = new HashMap<>();
		courseMap.put(101, new Course("DBDA", 9000, 0, 
				parse("2024-05-16"), parse("2024-09-16"), 
				Frequency.valueOf("WEEKEND_ONLY"), Status.PLANNED, parse("2024-09-16")));
		courseMap.put(102, new Course("DESD", 15000, 0, 
				parse("2024-06-16"), parse("2024-10-16"), 
				Frequency.valueOf("WEEKEND_ONLY"), Status.PLANNED, parse("2024-10-16")));
		courseMap.put(103, new Course("DAC", 45000, 0, 
				parse("2024-03-07"), parse("2024-08-19"), 
				Frequency.valueOf("DAILY"), Status.STARTED, parse("2024-08-19")));
		courseMap.put(104, new Course("AI", 100000, 0, 
				parse("2023-03-07"), parse("2023-08-19"), 
				Frequency.valueOf("DAILY"), Status.FINISHED, parse("2023-08-19")));
		courseMap.put(105, new Course("AI", 150000, 0, 
				parse("2025-05-29"), parse("2025-05-12"), 
				Frequency.valueOf("DAILY"), Status.PLANNED, parse("2025-05-12")));
		courseMap.put(106, new Course("DHCP", 10000, 0, 
				parse("2025-05-29"), parse("2025-05-12"), 
				Frequency.valueOf("DAILY"), Status.PLANNED, parse("2025-05-12")));
		courseMap.put(107, new Course("Cyber", 12000, 20, 
				parse("2024-05-29"), parse("2024-10-12"), 
				Frequency.valueOf("WEEKEND_ONLY"), Status.PLANNED, parse("2025-10-12")));
		return courseMap;
	}
}
