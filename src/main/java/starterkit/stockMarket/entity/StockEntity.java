package starterkit.stockMarket.entity; 

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "Stock")
public class StockEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7963331309787599483L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(length = 10)
	private String company;
	
	@Column(length = 10)
	private double buyValue;
	
	public StockEntity(Long id, String company, double buyValue) {
		this.id = id;
		this.company = company;
		this.buyValue = buyValue;
	}
	
	public StockEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getBuyValue() {
		return buyValue;
	}

	public void setBuyValue(double buyValue) {
		this.buyValue = buyValue;
	}
	
	

}
