package Library;

public class journalBuilder {

	
	String name = "";
	String publisher = "";
	int year = 0;
	String country = "";
	Boolean onLoan = false;
	int loaneeID = 0;
	
	public journalBuilder(String name) {
		this.name = name;
		
	}


	public journalBuilder publisher(String publisher) {
		this.publisher = publisher;
		return this;
	}

	public journalBuilder country(String country) {
		this.country = country;
		return this;
	}
	public journalBuilder year(int year) {
		this.year = year;
		return this;
	}	

	public Journal build() {
		return new Journal(this);
	}

}
