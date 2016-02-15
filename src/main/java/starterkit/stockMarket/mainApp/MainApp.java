package starterkit.stockMarket.mainApp;


import java.util.Date;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import starterkit.stockMarket.date.DateIterator;
import starterkit.stockMarket.player.Player;
import starterkit.stockMarket.to.StockTo;
import starterkit.stockMarket.wallet.currency.Pln;

public class MainApp {

	
	public static void main(String[] args) {
		Player player = new Player();
		DateIterator dateIterator = new DateIterator();
	
		while(dateIterator.hasNextDate()) {
			Set<StockTo> set = player.getBroker().getStockMarket().getStockList().get(dateIterator.getDate());
			System.out.println(dateIterator.getDate());
			for(final Iterator<StockTo> it = set.iterator() ; it.hasNext() ; ) {
				StockTo stock = it.next();
				System.out.println("Company: "+stock.getCompany()+", Buy price: "+stock.getBuyPrice());
			}
			dateIterator.nextDay();
		}
		
		
	}


}
