package cdac.java.q8.utils;

import cdac.java.q8.exceptions.StockException;
import cdac.java.q8.stock.Stock;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.Map;

public class StocksValidation {
	
	public static Stock validateInput(String stockId, String stockName, String companyName, 
			double price, String closingdate, int quantity, Map<String, Stock> stockMap) 
					throws StockException {
		
		validateDuplicateStockId(stockMap, stockId);
		validateStockClosingDate(closingdate);
		
		return new Stock(stockId, stockName, companyName, price, parse(closingdate), quantity);
		
	}

	private static void validateStockClosingDate(String closingdate) throws StockException {
		LocalDate date = LocalDate.now();
		if(!parse(closingdate).isAfter(date)) {
			throw new StockException(closingdate + " is must have in future!!!");
		}
		
	}

	private static void validateDuplicateStockId(Map<String, Stock> stockMap, String stockId)
			throws StockException {
		if(stockMap.containsKey(stockId)) {
			throw new StockException(stockId + " Already Exists!");
		}
	}
}
