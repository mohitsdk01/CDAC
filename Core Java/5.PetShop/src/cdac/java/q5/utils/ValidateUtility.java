package cdac.java.q5.utils;

import java.util.Map;

import cdac.java.q5.core.Order;
import cdac.java.q5.core.Pet;
import cdac.java.q5.exceptions.OutOfStockException;

public class ValidateUtility {
	public static Order orderInputValidate
	(Map<Integer, Pet> petMap, int petId, int quantity) throws OutOfStockException{
		validateQuantity(petMap, petId, quantity);
		return new Order(petId, quantity);
	}

	private static void validateQuantity(Map<Integer, Pet> petMap, int petId, int quantity)
			throws OutOfStockException {
		Pet pet = petMap.get(petId);
		if(pet.getStocks() < quantity) {
			throw new OutOfStockException
			("Stocks are lower than your order quantity. Please Enter appropriate Input!!!");
		}
		
	}
}
