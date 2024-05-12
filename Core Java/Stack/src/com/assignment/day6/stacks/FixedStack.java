package com.assignment.day6.stacks;


public class FixedStack implements Stack{
	private Customer[] persons;
	private int top;
	
	public FixedStack(){
		persons = new Customer[STACK_SIZE];
		int top = -1;
	}

	@Override
	public void push(Customer person) {
		if(isFull()) {
			System.out.println("Stack Overflow!!!");
			return;
		}
		persons[++top] = person;
		
	}

	@Override
	public Customer pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!!!");
			return null;
		}
		return persons[top--];
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}
	
	@Override
	public Customer peek() {
		if(isEmpty()) System.out.println("Stack is Empty");
		return persons[top];
	}

	//	@Override
	public boolean isFull() {
		return top == STACK_SIZE-1;
	}	
}
