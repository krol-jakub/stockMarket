package starterkit.stockMarket.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import starterkit.stockMarket.broker.Broker;

@Component
public class Player {
	
	@Autowired
	private Broker broker;

	public Broker getBroker() {
		return broker;
	}

	public void setBroker(Broker broker) {
		this.broker = broker;
	}

}
