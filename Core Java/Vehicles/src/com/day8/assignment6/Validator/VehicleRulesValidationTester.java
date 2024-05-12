package com.day8.assignment6.Validator;

//import com.day8.assignment6.Enum.*;
import com.day8.assignment6.Rules.TestRulesFuel;
import com.day8.assignment6.Rules.TestRulesLicence;
import com.day8.assignment6.Rules.TestRulesSpeed;
import java.util.Scanner;

public class VehicleRulesValidationTester {

	public static void main(String[] args) {
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter Licence Expiry Date: ");
				TestRulesLicence.validateLicence(sc.next());
				
				System.out.println("Enter Fuel Type: ");
				TestRulesFuel.validateFuel(sc.next());
				
				System.out.println("Enter current speed: ");
				TestRulesSpeed.validateSpeed(sc.nextInt());
			}
			catch (Exception e) {
				System.out.println(e);
			}

		}

	}
