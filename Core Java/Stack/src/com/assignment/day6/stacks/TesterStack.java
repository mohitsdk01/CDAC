package com.assignment.day6.stacks;

import java.util.Scanner;

public class TesterStack{

	private Stack stack;

    public TesterStack(int choice) {
        if (choice == 1) {
            stack = new FixedStack();
            System.out.println("Fixed Stack chosen.");
        } else if (choice == 2) {
            stack = new GrowableStack();
            System.out.println("Growable Stack chosen.");
        } else {
            System.out.println("Invalid choice!");
            System.exit(1);
        }
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Push data");
            System.out.println("2. Pop data");
            System.out.println("3. Peek data");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    push();
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    private void push() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer details (id name address): ");
        int id = sc.nextInt();
        String name = sc.next();
        String address = sc.next();
        Customer person = new Customer(id, name, address);
        stack.push(person);
    }

    private void pop() {
        Customer person = stack.pop();
        if (person != null) {
            System.out.println("Popped customer details: " + person);
        }
    }
    private void peek() {
        Customer person = stack.peek();
        if (person != null) {
            System.out.println("Peeked customer details: " + person);
        }
        else {
        	System.out.println("Stack is Empty!");
        }
    }
}
