package Stocks;

import java.util.ArrayList;

public class DateGathered {
	long date;
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
	
	
	
}
