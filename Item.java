package Library;

public abstract class Item {

	String publisher;
	int year;
	String country;
	Boolean onLoan;  
	int loaneeID;
	
	//Don't need with the builder pattern
	/*
	public Item(String publisher1, int year1, String country1){
		this.publisher = publisher1;
		this.year = year1;
		this.country = country1;
	}
	*/
	
	 void setPublisher(String pubName){
		publisher = pubName;
	}
	 void setYear(int yearNum){
		year = yearNum;
	}
	 
	public void setCountry(String countryName){
		country = countryName;
	}
	 
	public void setOnLoan(Boolean tf){
		onLoan = tf;
	}
	 public void setLoaneeID(int loaneeID1){
		loaneeID = loaneeID1;
	}
	 
	 
	 
	public String getPublisher(){
		return publisher;
		}
	public int getYear(){
		return year;
		}
	public String getCountry(){
		return country;
		}
	public Boolean getOnLoan(){
		return onLoan;
		}
	 public int getLoaneeID(){
		return loaneeID;
	}
	 
	
}
