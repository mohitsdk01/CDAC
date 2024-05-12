package cdac.java.q5.users;

public class Customer {
	private String customerId;
	private String customerPwd;
	
	public Customer(String customerId, String customerPwd) {
		super();
		this.customerId = customerId;
		this.customerPwd = customerPwd;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPwd() {
		return customerPwd;
	}

	public void setCustomerPwd(String customerPwd) {
		this.customerPwd = customerPwd;
	}
	
	
}
