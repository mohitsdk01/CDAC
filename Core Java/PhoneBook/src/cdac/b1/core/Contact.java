package cdac.b1.core;

import java.time.LocalDate;

public class Contact {
	private String pNo;
	private String name;
	private LocalDate dob;
	private String email;
	
	/**
	 * @param pNo
	 * @param name
	 * @param dob
	 * @param email
	 */
	public Contact(String pNo, String name, LocalDate dob, String email) {
		super();
		this.pNo = pNo;
		this.name = name;
		this.dob = dob;
		this.email = null;
	}

	
	public String getpNo() {
		return pNo;
	}


	public void setpNo(String pNo) {
		this.pNo = pNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public LocalDate getDob() {
		return dob;
	}


	@Override
	public String toString() {
		return "Contact [pNo=" + pNo + ", name=" + name + ", dob=" + dob + ", email=" + email + "]";
	}
	
	
	
}
