package starterkit.stockMarket.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateIterator {
	
	private Date date;
	private String firstDate = "20130102";
	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	
	public DateIterator() {
		try {
			this.date = format.parse(firstDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public boolean hasNextDate() {
		if(this.date.getMonth() == 11 && this.date.getDay() == 31) {
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("deprecation")
	public void next() {
		if(this.hasNextDate()) {
		date.setDate(date.getDay());
		}
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
