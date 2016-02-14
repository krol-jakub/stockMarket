package starterkit.stockMarket.broker;

import java.util.Date;
import java.util.List;

import starterkit.stockMarket.order.Order;
import starterkit.stockMarket.to.StockTo;

public interface Broker {
	
	public List<StockTo> askAboutTodayStocks(Date date);
	
	public StockTo buyExactAmountOfStocks(Order order);

}
