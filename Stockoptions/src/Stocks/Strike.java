package Stocks;

import java.math.BigDecimal;

public class Strike implements Comparable<Strike>{
	BigDecimal price;
	OptionInfo call;
	OptionInfo put;
	
	
	public Strike() {
	
	}


	public Strike(BigDecimal price, OptionInfo call, OptionInfo put) {
	
		this.price = price;
		this.call = call;
		this.put = put;
	}
	
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	public OptionInfo getCall() {
		return call;
	}
	public void setCall(OptionInfo call) {
		this.call = call;
	}
	
	
	public OptionInfo getPut() {
		return put;
	}
	public void setPut(OptionInfo put) {
		this.put = put;
	}


	
		
	


	@Override
	public int compareTo(Strike other) {
		return this.getPrice().compareTo(other.getPrice());
	}
	
	
}
