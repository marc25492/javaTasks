package Library;

public class Newspaper extends Item{

	String name;

	
	public Newspaper(newspaperBuilder builder)
	{
		
		this.name = builder.name;
		this.publisher = builder.publisher;
		this.year = builder.year;
		this.country = builder.country;
		this.onLoan = builder.onLoan;
		this.loaneeID = builder.loaneeID;
		
	}
	
	//SETTERS
	public void setName(String nameName){
			name = nameName;
		}
	
	//GETTERS
	public String getName(){
			return name;
		}

}
