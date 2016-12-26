package DataHandler;

import URLHandler.URLReader;

public class RegexParser {

	public static void main(String[] args){
		URLReader browser=new URLReader();
		
		System.out.println(browser.getContent("https://query1.finance.yahoo.com/v7/finance/options/PGH?formatted=true&crumb=y7uy0JJLpMC&lang=en-US&region=US&corsDomain=finance.yahoo.com"));
		
		
	}
	
	
	
	
	
	
}
