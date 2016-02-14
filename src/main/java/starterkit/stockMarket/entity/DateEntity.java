package starterkit.stockMarket.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Date")
public class DateEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4944635768907682808L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String date;
	
	@OneToMany(cascade = CascadeType.PERSIST)
    private List<StockEntity> stockList = new ArrayList<StockEntity>();
	
	public DateEntity(Long id, String date, List<StockEntity> stock) {
		this.id = id;
		this.date = date;
		this.stockList = stock;
	}
	
	public DateEntity() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<StockEntity> getStockList() {
		return stockList;
	}

	public void setStockList(List<StockEntity> stockList) {
		this.stockList = stockList;
	}
	
	

}
