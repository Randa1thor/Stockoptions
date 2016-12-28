package DataHandler;

import java.util.Arrays;
import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import URLHandler.URLReader;

public class RegexParser {
	
	YahooFinanceRegex yahooregex=new YahooFinanceRegex();
	
	//not sure the difference in performance
	// with regards to reluctant . searchers
	// or known structure searches.  
	// See expiration regex vs strikes regex
	
	public String[] getOptionExpirations(String webjson){//expirations see Jsonweb textfile		
		Matcher m=Pattern.compile(
				  yahooregex.getExpirations()).
				  matcher(webjson);
		if(!m.find())
			return null;  //probably should throw exception
		
		return m.group().
				substring(m.group().indexOf("[")+1, m.group().length()-1).
				split(",");
	}
	
	public String[] getOptionStrikes(String webjson){//strikes see Jsonweb textfile		
		Matcher m=Pattern.compile(
				  yahooregex.getStrikes()).
				  matcher(webjson);
		if(!m.find())
			return null;  //probably should throw exception
		
		return m.group().
				substring(m.group().indexOf("[")+1, m.group().length()-1).
				split(",");
		
	}
	
	public String getCalls(String webjson){//should be only one match see Jsonweb textfile		
		
		Matcher m=Pattern.compile(
				  yahooregex.getCalls()).
				  matcher(webjson);
		if(!m.find())
			return null;  //probably should throw exception
		
		return m.group();
	}
	
	public String getPuts(String webjson){
		
		Matcher m=Pattern.compile(
				  yahooregex.getPuts()).
				  matcher(webjson);
		if(!m.find())
			return null;  //probably should throw exception
		
		return m.group();
	}
	
	public void getIndividualOptionData(String webjson){//create obj for data or handle array.  obj is more maintainable
		
		throw new UnsupportedOperationException("Not yet supported.");
	}
	
	public void buildStockWithOptions(){
		//I need to pull this out and use variables that could be changed for the url
		URLReader browser=new URLReader();		
		String response=browser.getContent("https://query1.finance.yahoo.com/v7/finance/options/PGH?formatted=true&lang=en-US&region=US&corsDomain=finance.yahoo.com");
		
		System.out.println(response);
		
		RegexParser rp=new RegexParser();
		
		System.out.println(Arrays.toString(rp.getOptionExpirations(response)));
		System.out.println(Arrays.toString(rp.getOptionStrikes(response)));
		
		
	}
	
	
	
	

	public static void main(String[] args){
		
		
		
		
	}
	
	
	
	
	
	
}
