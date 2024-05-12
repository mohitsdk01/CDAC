package cdac.java.q4.cricket;

public class Cricketer {
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String phone;
	private int rating;
	
	public Cricketer(String firstName, String lastName, 
			int age, String email, String phone, int rating) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Cricketer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email
				+ ", phone=" + phone + ", rating=" + rating + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
