package starterkit.stockMarket.broker;

import starterkit.stockMarket.stockMarket.StockMarket;

public class Broker {

	private StockMarket stockMarket = new StockMarket();
	
	private String something = "broker something";
	
	public Broker() {
	}

	public StockMarket getStockMarket() {
		return stockMarket;
	}

	public void setStockMarket(StockMarket stockMarket) {
		this.stockMarket = stockMarket;
	}

	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}
	
	public void buyStocks(int amount) {
		
	}
	
}
