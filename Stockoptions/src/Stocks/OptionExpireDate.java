package Stocks;

import java.util.ArrayList;

public class OptionExpireDate implements Comparable<OptionExpireDate>{
	long expire_date;
	ArrayList<Strike> strikes;
	
	
	
	
	
	
	/**
	 * @return the expire_date
	 */
	public long getExpire_date() {
		return expire_date;
	}
	/**
	 * @return the strikes
	 */
	public ArrayList<Strike> getStrikes() {
		return strikes;
	}
	
	
	
	
	/**
	 * @param expire_date the expire_date to set
	 */
	public void setExpire_date(long expire_date) {
		this.expire_date = expire_date;
	}
	/**
	 * @param strikes the strikes to set
	 */
	public void setStrikes(ArrayList<Strike> strikes) {
		this.strikes = strikes;
	}
	
	
	
	@Override
	public int compareTo(OptionExpireDate other) {
		return Long.compare(this.getExpire_date(), other.getExpire_date());
	}
	
}
