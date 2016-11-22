package Library;

public class bookBuilder {
	int ISBN =0;
	String author = "";
	String title = "";
	String publisher = "";
	int year = 0;
	String country = "";
	Boolean onLoan = false;
	int loaneeID = 0;
	
	

	
	
	public bookBuilder(int ISBN1, String author1 ) {
		this.ISBN = ISBN1;
		this.author = author1;
	}

	public bookBuilder title(String title) {
		this.title = title;
		return this;
	}

	public bookBuilder publisher(String publisher) {
		this.publisher = publisher;
		return this;
	}

	public bookBuilder country(String country) {
		this.country = country;
		return this;
	}
	public bookBuilder year(int year) {
		this.year = year;
		return this;
	}	

	public Book build() {
		return new Book(this);
	}

}
