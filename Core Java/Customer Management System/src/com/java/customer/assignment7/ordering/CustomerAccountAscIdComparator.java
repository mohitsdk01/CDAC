package com.java.customer.assignment7.ordering;

import java.util.Comparator;

import com.java.customer.assignment7.customer.Customer;

public class CustomerAccountAscIdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getId() < o2.getId()) return -1;
		else if(o1.getId() == o2.getId()) return 0;
		else return 1;
	}
}
