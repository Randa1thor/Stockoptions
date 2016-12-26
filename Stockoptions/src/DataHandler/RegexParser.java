package DataHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import URLHandler.URLReader;

public class RegexParser {
	
	
	public String[] getOptionExpirations(String webjson){//expirations see Jsonweb textfile
		throw new UnsupportedOperationException("Not yet supported.");	
	}
	
	public String[] getOptionStrikes(String webjson){//strikes see Jsonweb textfile
		throw new UnsupportedOperationException("Not yet supported.");
	}
	
	public String getCalls(String webjson){//should be only one match see Jsonweb textfile
		throw new UnsupportedOperationException("Not yet supported.");
	}
	
	public String getPuts(String webjson){
		throw new UnsupportedOperationException("Not yet supported.");
	}
	
	public void getIndividualOptionData(String webjson){//create obj for data or handle array.  obj is more maintainable
		throw new UnsupportedOperationException("Not yet supported.");
	}
	
	

	public static void main(String[] args){
		URLReader browser=new URLReader();
		
		System.out.println(browser.getContent("https://query1.finance.yahoo.com/v7/finance/options/PGH?formatted=true&lang=en-US&region=US&corsDomain=finance.yahoo.com"));
		
		
	}
	
	
	
	
	
	
}
