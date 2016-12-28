package Stocks;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DateGathered implements Comparable<DateGathered>{
	long date;
	BigDecimal stock_price;
	ArrayList<OptionExpireDate> expirations;
	
	
	public DateGathered() {
		
	}
	
	public DateGathered(long date, ArrayList<OptionExpireDate> expirations) {
		
		this.date = date;
		this.expirations = expirations;
	}
	
	
	
	/**
	 * @return the date
	 */
	public long getDate() {
		return date;
	}
	/**
	 * @return the expirations
	 */
	public ArrayList<OptionExpireDate> getExpirations() {
		return expirations;
	}
	
	
	
	
	
	/**
	 * @param date the date to set
	 */
	public void setDate(long date) {
		this.date = date;
	}
	/**
	 * @param expirations the expirations to set
	 */
	public void setExpirations(ArrayList<OptionExpireDate> expirations) {
		this.expirations = expirations;
	}

	@Override
	public int compareTo(DateGathered other) {
		
		return Long.compare(this.getDate(), other.getDate());
	}
	
	
	
	
}
