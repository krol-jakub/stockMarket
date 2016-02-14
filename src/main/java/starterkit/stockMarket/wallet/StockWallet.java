package starterkit.stockMarket.wallet;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import starterkit.stockMarket.to.StockTo;

@Component
public class StockWallet {
	
	private Map<StockTo,Long> ownedStocks;
	
	public StockWallet() {
		ownedStocks = new HashMap<StockTo, Long>();
	}

	public Map<StockTo,Long> getOwnedStocks() {
		return ownedStocks;
	}

	public void setOwnedStocks(Map<StockTo,Long> ownedStocks) {
		this.ownedStocks = ownedStocks;
	}
	
	public void addStocksToWallet(StockTo stocks) {
		if(this.ownedStocks.containsKey(stocks.getCompany())) {
			long stocksAmount = this.ownedStocks.get(stocks) + stocks.getAmount();
			StockTo stockTo = new StockTo(stocks.getCompany(), stocks.getBuyPrice(), stocksAmount);
			this.ownedStocks.put(stockTo, stocksAmount);
		}
		else {
			this.ownedStocks.put(stocks, stocks.getAmount());
		}
		
	}
	
	public void removeStocksFromWallet(StockTo stocks) {
		if(this.ownedStocks.get(stocks.getAmount()) > stocks.getAmount()) {
			long stocksAmount = this.ownedStocks.get(stocks) - stocks.getAmount();
			StockTo stockTo = new StockTo(stocks.getCompany(), stocks.getBuyPrice(), stocksAmount);
			this.ownedStocks.put(stockTo, stocksAmount);
		}
		else {
			this.ownedStocks.remove(stocks);
		}
		
	}

}
;
