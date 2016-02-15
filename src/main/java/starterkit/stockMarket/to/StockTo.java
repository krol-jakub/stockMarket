package starterkit.stockMarket.to;

public class StockTo {
	
	private String company;
	private double buyPrice;
	private Long amount;
	
	public StockTo(String company, double buyPrice, Long amount) {
		super();
		this.company = company;
		this.buyPrice = buyPrice;
		this.amount = amount;
	}
	
	public StockTo(String company2, double buyValue, int i) {
		this.company = company2;
		this.buyPrice = buyValue;
		this.amount = (long) i;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	@Override
	public boolean equals(Object object) {
		if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        StockTo stockTo = (StockTo)object;
        if(!(this.getCompany().equals(stockTo.getCompany())))
        	return false;
        
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 5; 
		return hash * this.company.hashCode();
	}

}
