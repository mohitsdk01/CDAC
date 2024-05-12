package cdac.java.q1.utils;

import java.util.HashMap;
import java.util.Map;
import static java.time.LocalDate.parse;

import cdac.java.q1.exceptions.PenException;
import cdac.java.q1.pen.Brand;
import cdac.java.q1.pen.Pen;

public class PenValidations {
	
	public static Pen validateInput(String brand, String color, String inkColor, String material, 
			int stock, String listingDate, String stockUpdateDate, double price) throws PenException {
		
//		Brand userENteredBrand = validateBrand(brand);
		
				return new Pen(Brand.valueOf(brand.toUpperCase()), color, 
						inkColor, material, stock, parse(listingDate),
						parse(stockUpdateDate), price);	
	}

//	private static Brand validateBrand(String brand) throws PenException {
//		return Brand.valueOf(brand.toUpperCase());
//	}
}
