package cdac.java.q6.employee;

import java.time.LocalDate;

public class Employee {
	protected static int idCounter = 101;
	protected int empId;
	protected String name;
	protected LocalDate dateOfJoining;
	protected String phoneNumber;
	protected String AddharNumber;


	public Employee(String name, LocalDate 
			dateOfJoining, String phoneNumber, String addharNumber) {
		super();
		this.empId = ++idCounter;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.phoneNumber = phoneNumber;
		AddharNumber = addharNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public String getAddharNumber() {
		return AddharNumber;
	}



	public void setAddharNumber(String addharNumber) {
		AddharNumber = addharNumber;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", phoneNumber="
				+ phoneNumber + ", AddharNumber=" + AddharNumber + "]";
	}
}
