package starterkit.stockMarket.mainApp;


import java.util.Date;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import starterkit.stockMarket.player.Player;
import starterkit.stockMarket.to.StockTo;
import starterkit.stockMarket.wallet.currency.Pln;

public class MainApp {

	
	public static void main(String[] args) {
		Player player = new Player();
		
		System.out.println("Player");
		player.getMoneyWallet().addPlnsToWallet(new Pln(1500));
		System.out.println(player.getMoneyWallet().getPlnAmount().getAmount());
		System.out.println(player.getBroker().getSomething());
		System.out.println(player.getBroker().getStockMarket().getSomething());
		/*final Iterator<Entry<Date, Set<StockTo>>> it;
		for(it = player.getBroker().getStockMarket().getStockList().entrySet().iterator() ; it.hasNext() ; ) {
			System.out.println(it.next().getKey());
		}*/
		String s = player.getBroker().getStockMarket().getStockList().entrySet().iterator().next().getKey().toGMTString();
		System.out.println(s);
		StockTo stock1 = new StockTo("CAP",11.11,10);
		StockTo stock2 = new StockTo("CAP",12.33,20);
		System.out.println(stock1.equals(stock2));
		
	}


}
