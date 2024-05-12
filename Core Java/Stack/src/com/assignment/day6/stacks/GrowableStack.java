package com.assignment.day6.stacks;

public class GrowableStack implements Stack{
	private Customer[] persons;
	private int top;
	
	public GrowableStack() {
		persons = new Customer[STACK_SIZE];
		top = -1;
	}
	
	@Override
	public void push(Customer person) {
		if(isFull()) {
			persons = resizeStack(persons);
		}
		persons[++top] = person;
	}

	@Override
	public Customer pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Stack Underflow!!!");
		}
		return persons[top--];
	}
	
	@Override
	public Customer peek() {
		if(top == -1) System.out.println("Stack is Empty");
		return persons[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
	public Customer[] resizeStack(Customer[] persons) {
		Customer[] newCustomer = new Customer[persons.length * 2];
		System.arraycopy(persons, 0, persons, 0, persons.length);
		return newCustomer;
		
	}
	
	public boolean isFull() {
		return top == STACK_SIZE;
	}
	
}
