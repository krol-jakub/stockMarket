package starterkit.stockMarket.wallet;

import starterkit.stockMarket.wallet.currency.Pln;

public class MoneyWallet {
	
	private Pln plnAmount;

	public Pln getCurrency() {
		return plnAmount;
	}

	public void setCurrency(Pln plns) {
		this.plnAmount = plns;
	}

}
