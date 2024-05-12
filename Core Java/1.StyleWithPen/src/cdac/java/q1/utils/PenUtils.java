package cdac.java.q1.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static java.time.LocalDate.parse;

import java.time.LocalDate;

import static cdac.java.q1.pen.Brand.CELLO;
import static cdac.java.q1.pen.Brand.HAUSER;
import static cdac.java.q1.pen.Brand.LINC;
import static cdac.java.q1.pen.Brand.PARKER;
import static cdac.java.q1.pen.Brand.REYNOLDS;
import static cdac.java.q1.pen.Brand.STYLO;

import cdac.java.q1.exceptions.PenException;
import cdac.java.q1.pen.Pen;

public class PenUtils {
	
	public static Map<Integer, Pen> populateMap(){
		Map<Integer, Pen> penMap = new HashMap<>();
		penMap.put(100, new Pen(CELLO, "Teal", "Blue", "Plastic", 15, parse("2023-10-11")
				, parse("2023-10-11"), 10.0));
		penMap.put(101, new Pen(REYNOLDS, "Red", "Red", "Alloy", 11, parse("2023-11-09")
				, parse("2023-11-09"), 20.0));
		penMap.put(102, new Pen(PARKER, "Green", "Black", "Metal", 20, parse("2023-03-13")
				, parse("2023-03-13"), 50.0));
		penMap.put(104, new Pen(STYLO, "Yellow", "Violet", "Plastic", 60, parse("2022-06-21")
				, parse("2022-06-21"), 30.0));
		penMap.put(105, new Pen(LINC, "Brown", "Blue", "Plastic", 60, parse("2022-06-21")
				, parse("2022-08-21"), 30.0));
		penMap.put(106, new Pen(HAUSER, "Yellow", "Grey", "Alloy", 60, parse("2022-06-21")
				, parse("2022-12-21"), 30.0));


		return penMap;
	}
	
	public static void updateQuantity(String brand, String material, 
			String color, String inkColor, int newQ, Map<Integer, Pen> penMap) throws PenException {
		for(Pen p : penMap.values()) {
//			System.out.println(p.getBrand().name()+"  "+p.getMaterial()+"  "+p.getColor()+"  "+p.getInkColor());
			if(brand.equalsIgnoreCase(p.getBrand().name()) && material.equalsIgnoreCase(p.getMaterial()) && color.equalsIgnoreCase(p.getColor())
					&& inkColor.equalsIgnoreCase(p.getInkColor())) {
				p.setStock(p.getStock() + newQ);
				p.setStockUpdateDate(LocalDate.now());
				return;
			}
		}
		throw new PenException("Required Entry not Found!!");
	}
	
	public static void setDiscount(Map<Integer, Pen> penMap) throws PenException {
		LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
		for(Pen pen : penMap.values()) {
			boolean isSoldInLastThreeMonths = pen.getStockUpdateDate().isAfter(threeMonthsAgo) 
					|| pen.getStockUpdateDate().isEqual(threeMonthsAgo);
			if(!isSoldInLastThreeMonths) {
				pen.setPrice(pen.getPrice() - pen.getPrice()*0.2);
			}
		}
		System.out.println("Booom You Got 20% discount on Pens!");
	}
	
	public static void removePen(Map<Integer, Pen> penMap) throws PenException {
		ArrayList<Integer> listOfPensID = new ArrayList<>();
		LocalDate nineMonthsAgo = LocalDate.now().minusMonths(9);
		for(Pen pen : penMap.values()) {
			boolean isSoldInLastNineMonths = pen.getStockUpdateDate().isAfter(nineMonthsAgo) 
					|| pen.getStockUpdateDate().isEqual(nineMonthsAgo);
			if(!isSoldInLastNineMonths) {
				listOfPensID.add(pen.getId());
			}
		}
		for(Integer penId : listOfPensID)
			penMap.remove(penId);
		System.out.println("Pens are removed which are older than 9 months!!");
	}
}
