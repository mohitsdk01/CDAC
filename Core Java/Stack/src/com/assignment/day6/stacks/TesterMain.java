package com.assignment.day6.stacks;
import java.util.*;

public class TesterMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Stack Type:");
        System.out.println("1. Fixed Stack");
        System.out.println("2. Growable/Dynamic Stack");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        TesterStack testStacks = new TesterStack(choice);

        testStacks.start();
        sc.close();
	}
}
