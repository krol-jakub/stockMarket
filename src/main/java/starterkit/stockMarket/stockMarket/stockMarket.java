package starterkit.stockMarket.stockMarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import starterkit.stockMarket.stockReader.StockReader;

@Component
public class StockMarket {
	
	@Autowired
	private StockReader stockReader;

	public StockReader getStockReader() {
		return stockReader;
	}

	public void setStockReader(StockReader stockReader) {
		this.stockReader = stockReader;
	}

}
