package com.practice.test;
import com.practice.events.*;
import java.util.*;
public class TestEvent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Person p;
//		p = new Student("Mohit","Kirange", 2024, "DAC", 560000, 89.23);
//		System.out.println(p.toString());
//		
//		p = new Faculty("Mohit","Kirange", 20, "Java");
//		System.out.println(p.toString());
		
		System.out.println("Enter the Number of Students Details: ");
		Person[] Peoples = new Student[sc.nextInt()];
		
		for(int i=0; i<Peoples.length; i++) {
			System.out.println("Enter Student Details: ");
			Peoples[i] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
		}
		
		for(Person ps : Peoples) {
			System.out.println(ps);
		}
		
		sc.close();
	}

}
