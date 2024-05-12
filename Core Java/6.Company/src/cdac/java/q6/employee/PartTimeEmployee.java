package cdac.java.q6.employee;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {

	private double hourlySal;
	
	public PartTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String addharNumber, double hourlySal) {
		super(name, dateOfJoining, phoneNumber, addharNumber);
		// TODO Auto-generated constructor stub
		this.hourlySal = hourlySal;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [empId=" + empId + ", name=" + name + ", dateOfJoining=" + dateOfJoining
				+ ", phoneNumber=" + phoneNumber + ", AddharNumber=" + AddharNumber + "]";
	}

	public double getHourlySal() {
		return hourlySal;
	}

	public void setHourlySal(double hourlySal) {
		this.hourlySal = hourlySal;
	}	
}
