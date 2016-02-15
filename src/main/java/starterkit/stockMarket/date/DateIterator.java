package starterkit.stockMarket.date;

import org.joda.time.LocalDate;

public class DateIterator {
	
	private LocalDate date = new LocalDate(2013,1,2);
	
	public DateIterator() {
		
	}
	
	public void nextDay() {
		if(!nextDayAWeekend()) {
			this.date = date.plusDays(1);		
		}
		else {
			this.date = date.plusDays(3);
		}
	}
	
	public boolean nextDayAWeekend() {
		if(date.getDayOfWeek() == 5) {
			return true;
		}
		return false;
	}
	
	public boolean hasNextDate() {
		if(date.getMonthOfYear() == 12 && date.getDayOfMonth() == 31) {
			return false;
		}
		else {
			return true;
		}
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
