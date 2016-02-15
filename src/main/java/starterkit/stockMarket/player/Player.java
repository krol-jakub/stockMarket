package starterkit.stockMarket.player;

import starterkit.stockMarket.broker.Broker;
import starterkit.stockMarket.strategy.Strategy;
import starterkit.stockMarket.strategy.Impl.RandomStrategy;
import starterkit.stockMarket.to.StockTo;
import starterkit.stockMarket.wallet.MoneyWallet;
import starterkit.stockMarket.wallet.StockWallet;

public class Player {
	
	private Broker broker;
	private Strategy playingStrategy;
	private MoneyWallet moneyWallet;
	private StockWallet stockWallet;
	
	public Player() {
		moneyWallet = new MoneyWallet(10000);
		stockWallet = new StockWallet();
		broker = new Broker();
		playingStrategy = new RandomStrategy();
	}

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public Strategy getPlayingStrategy() {
		return playingStrategy;
	}

	public void setPlayingStrategy(Strategy playingStrategy) {
		this.playingStrategy = playingStrategy;
	}

	public MoneyWallet getMoneyWallet() {
		return moneyWallet;
	}

	public void setMoneyWallet(MoneyWallet moneyWallet) {
		this.moneyWallet = moneyWallet;
	}

	public StockWallet getStockWallet() {
		return stockWallet;
	}

	public void setStockWallet(StockWallet stockWallet) {
		this.stockWallet = stockWallet;
	}

}
