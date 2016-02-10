package starterkit.stockMarket.wallet;

import java.util.HashMap;
import java.util.Map;

public class StockWallet {
	
	// TODOÖ Think about Map K,V
	
	private Map<SingleStock,Long> ownedStocks;
	
	public StockWallet() {
		ownedStocks = new HashMap<SingleStock, Long>();
	}

	public Map<SingleStock,Long> getOwnedStocks() {
		return ownedStocks;
	}

	public void setOwnedStocks(Map<SingleStock,Long> ownedStocks) {
		this.ownedStocks = ownedStocks;
	}
	
	public void addStocksToWallet(SingleStock stock, Long amount) {
		// TODO: fill the body
	}
	
	public void takeStocksFromWallet(Long amount) {
		// TODO: fill the body
	}

}
