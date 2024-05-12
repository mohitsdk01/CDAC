package com.day8.assignment6.Rules;

import com.day8.assignment6.Enum.*;
import com.day8.assignment6.Exceptions.UnSupportedFuelException;

public class TestRulesFuel {
	
	public static void validateFuel(String fuelType) 
			throws UnSupportedFuelException {
		for(FuelEnum e : FuelEnum.values()) {			
			if(e.name().equalsIgnoreCase(fuelType))
				System.out.println(fuelType + " is Supported...");
			return;
		}
		throw new UnSupportedFuelException(fuelType + " is Not Supported!");
	}
	
	public String toString(String str) {
		return str;
	}
}
