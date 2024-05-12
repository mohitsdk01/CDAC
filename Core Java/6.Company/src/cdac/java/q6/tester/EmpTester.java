package cdac.java.q6.tester;

import java.util.Map;
import java.util.Scanner;

import cdac.java.q6.employee.Employee;
import static cdac.java.q6.utils.EmpUtils.populateMap;

public class EmpTester {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System");
		
		try(Scanner sc = new Scanner(System.in)){
			
			Map<Integer, Employee> empMap = populateMap();
			
			
		}

	}

}
