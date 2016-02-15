package starterkit.stockMarket.wallet;

import org.junit.Test;
import org.springframework.util.Assert;

public class MoneyWalletTest {
	
	MoneyWallet moneyWallet = new MoneyWallet(1000);
	
	@Test
	public void performSomeTest() {
		Assert.notNull(moneyWallet);
		Assert.isTrue(moneyWallet.getPlnAmount().getAmount() == 1000);
	}

}
