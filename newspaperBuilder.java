package Library;

public class newspaperBuilder {

		String name = "";
		String publisher = "";
		int year = 0;
		String country = "";
		Boolean onLoan = false;
		int loaneeID = 0;
		
		
		public newspaperBuilder(String name) {
			this.name = name;
			
		}

	
		public newspaperBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}

		public newspaperBuilder country(String country) {
			this.country = country;
			return this;
		}
		public newspaperBuilder year(int year) {
			this.year = year;
			return this;
		}	

		public Newspaper build() {
			return new Newspaper(this);
		}

	}

