package cdac.java.q6.utils;

import java.util.HashMap;
import java.util.Map;

import cdac.java.q6.employee.Employee;
import static java.time.LocalDate.parse;

public class EmpUtils {
	public static Map<Integer, Employee> populateMap(){
		Map<Integer, Employee> employees = new HashMap<>();
		employees.put(1, new Employee("John Doe", parse("2012-12-30"), "1234567890", "123456789012"));
        employees.put(2, new Employee("Jane Smith", parse("2019-10-20"), "9876543210", "987654321098"));
        employees.put(3, new Employee("Alice Johnson", parse("2021-03-08"), "5555555555", "555555555555"));
        employees.put(4, new Employee("Bob Williams", parse("2018-07-03"), "9999999999", "999999999999"));
		return employees;
	}
}
