package starterkit.stockMarket.order;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("order")
public class Order {
	
	private Long amount;
	private Date date;
	private String company;
	
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
