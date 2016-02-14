package starterkit.stockMarket.mapper;

import starterkit.stockMarket.wallet.currency.Euro;
import starterkit.stockMarket.wallet.currency.Pln;

public class currencyMapper {
	
	private final double EXCHANGE_RATIO_MAX = 4.1;
	private final double EXCHANGE_RATIO_MIN = 3.9;
	
	public Pln eurosToPln(Euro euros) {
		return new Pln((euros.getAmount() * (Math.random() * (EXCHANGE_RATIO_MAX - EXCHANGE_RATIO_MIN) + EXCHANGE_RATIO_MIN)));
	}
	
	public Euro plnToEuros(Pln plns) {
		return new Euro((plns.getAmount() / (Math.random() * (EXCHANGE_RATIO_MAX - EXCHANGE_RATIO_MIN) + EXCHANGE_RATIO_MIN)));
	}

}
