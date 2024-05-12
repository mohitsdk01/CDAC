package cdac.java.q6.employee;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
	
	private double monthlySal;
	
	
	
	public FullTimeEmployee(String name, LocalDate dateOfJoining, String phoneNumber, String addharNumber,
			double monthlySal) {
		super(name, dateOfJoining, phoneNumber, addharNumber);
		this.monthlySal = monthlySal;
	}

	
	
	public double getMonthlySal() {
		return monthlySal;
	}



	public void setMonthlySal(double monthlySal) {
		this.monthlySal = monthlySal;
	}



	@Override
	public String toString() {
		return "FullTimeEmployee [empId=" + empId + ", name=" + name + ", dateOfJoining=" + dateOfJoining
				+ ", phoneNumber=" + phoneNumber + ", AddharNumber=" + AddharNumber + "]";
	}
	
	
}
