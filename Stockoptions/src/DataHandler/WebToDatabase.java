package DataHandler;

public class WebToDatabase {
	
	//needs logic to get from JSONs to Database structure
	//use the regexparser to pull data from web response
	//and insert into database
	
	
	//All methods short of option data itself should test if new and insert if not
	//Database design using unique fields may make this possible for all except DatesGathered
	
	//currently believe a fully stocked StocksWithOption class should be used to disect data
	//A different data structure may be designed to store possible repetitive data to 
	//improve performance vs the unique database fields.
	
	
	
	public int insertStock(){//once gui is built this should only have to be called when user uses "wizard" to add a stock
		throw new UnsupportedOperationException("not yet supported");
	}
	
	public int insertStrike(){//since Strike is unique might be more efficient to just attempt insertion
		throw new UnsupportedOperationException("not yet supported");
	}
	
	public int insertDateGathered(){//this is one that may need to be searched first due to time being stored as milliseconds/seconds
		throw new UnsupportedOperationException("not yet supported");
	}
	
	public int insertOptionExpiration(){//since expiration is unique might be more efficient to just attempt insertion
		throw new UnsupportedOperationException("not yet supported");
	}
	
	public int insertOptionData(){//no unique fields all testing for repetative data should be tested before this
		throw new UnsupportedOperationException("not yet supported");
	}

}
