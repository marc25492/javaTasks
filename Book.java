package Library;

public class Book extends Item {

	int ISBN;
	String author;
	String title;
	String anotherTitle
	
	public Book(bookBuilder builder)
	{
		this.ISBN = builder.ISBN;
		this.author =builder.author;
		this.title = builder.title;
		this.publisher = builder.publisher;
		this.year = builder.year;
		this.country = builder.country;
		this.onLoan = builder.onLoan;
		this.loaneeID = builder.loaneeID;
		

	}
	
	
	
	
	
	//SETTERS
	 public void setISBN(int isbnNum){
			ISBN = isbnNum;
		}
	public void setAuthor(String authorName){
			author = authorName;
		}
	public void setTitle(String titleName){
		title = titleName;
	}
	
	//GETTERS
	 public int getISBN(){
			return ISBN;
		}
	public String getAuthor(){
			return author;
		}
	public String getTitle(){
		return title;
	}
	
	//OUTPUT
	public void outputALL(){
		
		System.out.println("Title: "+title +"\nAuthor: " +author +"\nISBN: "+ISBN+"\nOn loan: "+onLoan);
	}
}
