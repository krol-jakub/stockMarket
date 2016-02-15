package starterkit.stockMarket.broker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import starterkit.stockMarket.stockMarket.StockMarket;

@Component
public class Broker {

	@Autowired
	private StockMarket stockMarket;

	public StockMarket getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}
	
}
