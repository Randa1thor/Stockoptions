package Stocks;

public class Stock {
	private String name;
	private String symbol;
	
	
		
	public Stock() {
		
	}


	public Stock(String name, String symbol) {
		
		this.name = name;
		this.symbol = symbol;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return symbol;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param symbol the symbol to set
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	
}
