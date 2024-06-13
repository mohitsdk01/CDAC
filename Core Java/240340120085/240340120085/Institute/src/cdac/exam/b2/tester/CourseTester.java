package cdac.exam.b2.tester;


import java.util.Map;
import java.util.Scanner;

import cdac.exam.b2.core.Course;
import static cdac.exam.b2.utils.Utility.planNewCourse;
import static cdac.exam.b2.utils.Utility.updateCourse;
import static cdac.exam.b2.utils.Utility.cancelShortTimeCourses;
import static cdac.exam.b2.utils.Utility.discountOnCourse;
import static cdac.exam.b2.utils.populateData.populateCourseMap;

public class CourseTester {

	public static void main(String[] args) {
		System.out.println("Welcome to Institute");
		
		try(Scanner sc = new Scanner(System.in)){
			Map<Integer, Course> courseMap = populateCourseMap();
			boolean exit = false;
			int choice;
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Plan a New Course. \n"
						+ "2. Update Course Details. \n"
						+ "3. Add discount of 20% for all weekends courses scheduled in next month. \n"
						+ "4. Cancel all the short term courses (duration less than one month) planned for next year. \n"
						+ "5. Exit\n");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						planNewCourse(courseMap, sc);
						break;
					case 2:
						updateCourse(courseMap, sc);
						break;
						
					case 3:
						discountOnCourse(courseMap, sc);
						break;
						
					case 4:
						cancelShortTimeCourses(courseMap, sc);
						break;
						
					case 5:
						for(Course c : courseMap.values())
							System.out.println(c);
						exit = true;
						break;
					}
				}catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
			}while(!exit);
		}

	}

}
