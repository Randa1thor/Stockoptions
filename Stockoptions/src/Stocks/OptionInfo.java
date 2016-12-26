package Stocks;

import java.math.BigDecimal;

public class OptionInfo {
	
	BigDecimal lastprice;
	BigDecimal ask;
	BigDecimal bid;
	BigDecimal impliedvolatility;
	int volume;
	int openinterest;
	boolean iscall;
	long lasttradedate;
	
	
	public OptionInfo() {
		
	}
	
	public OptionInfo(BigDecimal lastprice, BigDecimal ask, BigDecimal bid,
			BigDecimal impliedvolatility, int volume, int openinterest,
			boolean iscall, long lasttradedate) {
		
		this.lastprice = lastprice;
		this.ask = ask;
		this.bid = bid;
		this.impliedvolatility = impliedvolatility;
		this.volume = volume;
		this.openinterest = openinterest;
		this.iscall = iscall;
		this.lasttradedate = lasttradedate;
	}

	/**
	 * @return the lastprice
	 */
	public BigDecimal getLastprice() {
		return lastprice;
	}

	/**
	 * @return the ask
	 */
	public BigDecimal getAsk() {
		return ask;
	}

	/**
	 * @return the bid
	 */
	public BigDecimal getBid() {
		return bid;
	}

	/**
	 * @return the impliedvolatility
	 */
	public BigDecimal getImpliedvolatility() {
		return impliedvolatility;
	}

	/**
	 * @return the volume
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * @return the openinterest
	 */
	public int getOpeninterest() {
		return openinterest;
	}

	/**
	 * @return the iscall
	 */
	public boolean isIscall() {
		return iscall;
	}

	/**
	 * @return the lasttradedate
	 */
	public long getLasttradedate() {
		return lasttradedate;
	}
	
	
	

	/**
	 * @param lastprice the lastprice to set
	 */
	public void setLastprice(BigDecimal lastprice) {
		this.lastprice = lastprice;
	}

	/**
	 * @param ask the ask to set
	 */
	public void setAsk(BigDecimal ask) {
		this.ask = ask;
	}

	/**
	 * @param bid the bid to set
	 */
	public void setBid(BigDecimal bid) {
		this.bid = bid;
	}

	/**
	 * @param impliedvolatility the impliedvolatility to set
	 */
	public void setImpliedvolatility(BigDecimal impliedvolatility) {
		this.impliedvolatility = impliedvolatility;
	}

	/**
	 * @param volume the volume to set
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * @param openinterest the openinterest to set
	 */
	public void setOpeninterest(int openinterest) {
		this.openinterest = openinterest;
	}

	/**
	 * @param iscall the iscall to set
	 */
	public void setIscall(boolean iscall) {
		this.iscall = iscall;
	}

	/**
	 * @param lasttradedate the lasttradedate to set
	 */
	public void setLasttradedate(long lasttradedate) {
		this.lasttradedate = lasttradedate;
	}
	
	
	
	
	
}
