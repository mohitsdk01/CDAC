package com.java.hashmap.customer.utils;

import java.util.Comparator;

import com.java.hashmap.customer.Customer;

public class CustomerEmailComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
