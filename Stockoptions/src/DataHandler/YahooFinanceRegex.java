package DataHandler;


/*
 * known structure "calls":[{     }}],  only testing for [    ] though this may be an issue later
 * same for puts
 */

public class YahooFinanceRegex {
	
	private String calls;
	private String puts;
	private String expirations;
	private String strikes;
	private String optiondata;
	
	public YahooFinanceRegex() {
		this.calls="\"calls\":\\[.*?\\]";
		this.puts="\"puts\":\\[.*?\\]";
		this.expirations="\"expirationDates\":\\[[\\d*,]*\\]";
		this.strikes="\"strikes\":\\[.*?\\]";
		this.optiondata="\"percentChange\":\\{.*?\\}\\}";
	}



	public YahooFinanceRegex(String calls, String puts, String expirations,
			String strikes, String optiondata) {
		
		this.calls = calls;
		this.puts = puts;
		this.expirations = expirations;
		this.strikes = strikes;
		this.optiondata = optiondata;
	}
	
	
	
	/**
	 * @return the calls
	 */
	public String getCalls() {
		return calls;
	}
	/**
	 * @return the puts
	 */
	public String getPuts() {
		return puts;
	}
	/**
	 * @return the expirations
	 */
	public String getExpirations() {
		return expirations;
	}
	/**
	 * @return the strikes
	 */
	public String getStrikes() {
		return strikes;
	}
	/**
	 * @return the optiondata
	 */
	public String getOptiondata() {
		return optiondata;
	}
	
	
	
	/**
	 * @param calls the calls to set
	 */
	public void setCalls(String calls) {
		this.calls = calls;
	}
	/**
	 * @param puts the puts to set
	 */
	public void setPuts(String puts) {
		this.puts = puts;
	}
	/**
	 * @param expirations the expirations to set
	 */
	public void setExpirations(String expirations) {
		this.expirations = expirations;
	}
	/**
	 * @param strikes the strikes to set
	 */
	public void setStrikes(String strikes) {
		this.strikes = strikes;
	}
	/**
	 * @param optiondata the optiondata to set
	 */
	public void setOptiondata(String optiondata) {
		this.optiondata = optiondata;
	}
	
	
	
	

}
