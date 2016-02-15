package starterkit.stockMarket.stockMarket;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import starterkit.stockMarket.stockReader.StockReader;
import starterkit.stockMarket.to.StockTo;

public class StockMarket {
	
	private StockReader stockReader = new StockReader();
	private Map<Date, Set<StockTo>> stockList;
	
	private String something = "stock something";
	
	public StockMarket() {
		try {
			stockList = stockReader.readFile();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	public StockReader getStockReader() {
		return stockReader;
	}

	public void setStockReader(StockReader stockReader) {
		this.stockReader = stockReader;
	}

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}

	public Map<Date, Set<StockTo>> getStockList() {
		return stockList;
	}

	public void setStockList(Map<Date, Set<StockTo>> stockList) {
		this.stockList = stockList;
	}

}
