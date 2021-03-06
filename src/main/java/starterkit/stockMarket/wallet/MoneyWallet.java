package starterkit.stockMarket.wallet;

import starterkit.stockMarket.wallet.currency.Euro;
import starterkit.stockMarket.wallet.currency.Pln;

public class MoneyWallet {
	
	private Pln plnAmount;
	private Euro euroAmount;

	public MoneyWallet(int i) {
		this.plnAmount = new Pln(i);
	}

	public Pln getPlnAmount() {
		return plnAmount;
	}

	public void setPlnAmount(Pln plns) {
		this.plnAmount = plns;
	}

	public Euro getEuroAmount() {
		return euroAmount;
	}

	public void setEuroAmount(Euro euroAmount) {
		this.euroAmount = euroAmount;
	}
	
	public void addPlnsToWallet(Pln pln) {
		this.plnAmount.setAmount(pln.getAmount() + plnAmount.getAmount());
	}
	 
	public void takePlnsFromWallet(Pln pln) {
		if(this.plnAmount.getAmount() > pln.getAmount()) {
			this.plnAmount.setAmount(plnAmount.getAmount() - pln.getAmount());
		}
		else {
			this.plnAmount.setAmount(0);
		}
	}

}
