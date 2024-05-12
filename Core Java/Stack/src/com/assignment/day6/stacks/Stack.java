package com.assignment.day6.stacks;

public interface Stack {
	int STACK_SIZE = 3;
	
	void push(Customer person);
	Customer pop();
	Customer peek();
	boolean isEmpty();
//	boolean isFull();
}
