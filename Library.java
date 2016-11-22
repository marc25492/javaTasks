package Library;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Library {
	
	static List<Book> bookLib = new ArrayList<Book>();
	static List<User> userList = new ArrayList<User>();


	
	
	public static void add(Book name){
		
		
		bookLib.add(name);
	}
	
	
	
	
	public static void registerPerson(User userName){
		
		userList.add(userName);
	}
	

	
	public static void checkOut(Item itemName){
		
		itemName.setOnLoan(true);
		
	}
	
	public static void checkIn(Item itemName, User userID){
		
		itemName.setOnLoan(false);
	}
	
	
	
	
	//Main Method
	public static void main(String[] args){
		
	
		String cont = "y";
		
		while (cont.equals("y")){
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("\nWhich function would you like to use? \n Add Book:1 			Remove Book:2 		Update Book:3 \n Register Person:4		Delete Person:5		Update Person: 6	\n Check Book In:7 		Check Out Book:8	Output all book details:9");
	    int n = scanner1.nextInt();
		scanner1.useDelimiter("\\n");

		
		
		switch (n){
		
		case 1: 
			//Add new book
			System.out.print("Please enter the details \n");

				String name1 = scanner1.nextLine();
				
				System.out.print("Enter the name of the book which you would like to add:");
				String name = scanner1.nextLine();
				
				System.out.print("Who wrote it?");
				String auth = scanner1.nextLine();
				
				System.out.print("Enter the ISBN number.");
				String line = scanner1.nextLine();
				int isbn = Integer.parseInt(line);
				
				
				
				System.out.print("Enter the name of the publisher");
				String publish = scanner1.nextLine();
				
				System.out.print("Enter the country of publication");
				String country = scanner1.nextLine();
			
				System.out.print("Enter the year printed.");
				String line2 = scanner1.nextLine();
				int year = Integer.parseInt(line2);
			

				
				//Create the new book object
				Book book = new bookBuilder(isbn, auth).title(name).publisher(publish).country(country).year(year).build();
				//Add to library
				add(book);
				
				System.out.println("\n \n" + book.getTitle() + " was successfully added to the system.\n");
				
				
				System.out.print("Another Function? \ny=yes\nn=no.");
				 cont = scanner1.nextLine();
				
				
				break;
				
		case 2:
			//Remove Book
			String prettyVoid4 = scanner1.nextLine();

			System.out.print("Please enter the name of the Book which you which to delete  \n");

			String bookName1 = scanner1.nextLine();
			
			for (int i= 0; i<bookLib.size(); i++ ){
				
				if (bookName1.equals(bookLib.get(i).getTitle())){
					
					System.out.println("Book Found\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					userList.remove(bookLib.get(i));
					System.out.println("Book Deleted\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					i = bookLib.size();
				}
			}
			System.out.print("Another Function? \ny=yes\nn=no.");
			 cont = scanner1.nextLine();
			
			break;
			
		case 3:
			//Update Book
			
			String prettyVoid5 = scanner1.nextLine();

			System.out.print("Please enter the name of the Book which you wish to modify\n");

			String bookName4 = scanner1.nextLine();
			
			for (int i= 0; i<bookLib.size(); i++ ){
				
				if (bookName4.equals(bookLib.get(i).getTitle())){
					
			
					
					System.out.print("Please pick which attribute you wish to modify: \n1 - ISBN		2 - Title			3 - Author");

					String sadg = scanner1.nextLine();
					int cond1 = Integer.parseInt(sadg);
					
					switch(cond1){
					
					case 1:
						
						
						System.out.print("Please enter the Books's new ISBN:");

						   
						String sauh = scanner1.nextLine();
						int isbnNum = Integer.parseInt(sauh);
						
						
						bookLib.get(i).setISBN(isbnNum);
						
						try {
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						System.out.print("The Book's ISBN has been changed to: "+bookLib.get(i).getISBN()+"\n\n");
						
				
						break;
						
					case 2:
						
						
						
						System.out.print("Please enter the Books's new title:");
						
						String newBookName = scanner1.nextLine();
						
						bookLib.get(i).setTitle(newBookName);
						
						try {
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						System.out.print("The Book's name has been changed to: "+bookLib.get(i).getTitle() + "\n\n");
						
						break;
						
						
					case 3:
						
						
						System.out.print("Please enter the Books's new author:");
						
						String newBookAuth = scanner1.nextLine();
						
						bookLib.get(i).setAuthor(newBookAuth);
						
						try {
							TimeUnit.SECONDS.sleep(2);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						System.out.print("The Book's author has been changed to: "+bookLib.get(i).getAuthor() + "\n\n");
						
						break;
						
						
						
					}
					
					
					
					i = bookLib.size();
				}
			}
			
			
			
			
			System.out.print("Another Function? \ny=yes\nn=no.");
			 cont = scanner1.nextLine();
			break;
			
		case 4: 
			//Register Person
			System.out.print("Please enter the details \n");

			String hj = scanner1.nextLine();
			
			System.out.print("Enter the name of the person you wish to register:");
			String namePerson = scanner1.nextLine();
			
			
			System.out.print("Enter a new ID number:");
			String line3 = scanner1.nextLine();
			int idNum = Integer.parseInt(line3);
			
			User user1 = new User(namePerson, idNum );
			registerPerson(user1);
			System.out.println("\n \n" + user1.getName() + " was successfully added to the system.\n\n\n\n\n\n");
			
			System.out.print("Another Function? \ny=yes\nn=no.");
			 cont = scanner1.nextLine();
			break;
			
			
		case 5:
			//Delete Person
			
			String prettyVoid3 = scanner1.nextLine();

			System.out.print("Please enter the name of the User whos details need ammending  \n");

			String nameUser2 = scanner1.nextLine();
			
			for (int i= 0; i<userList.size(); i++ ){
				
				if (nameUser2.equals(userList.get(i).getName())){
					
					System.out.println("Target Acquired\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}


					userList.remove(userList.get(i));
					System.out.println("User Deleted\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i = userList.size();
					System.out.print("Another Function? \ny=yes\nn=no.");
					 cont = scanner1.nextLine();
				}
			}
			
			
			
			break;
			
		case 6:
			//Update Person
			String prettyVoid = scanner1.nextLine();

			System.out.print("Please enter the name of the User whos details need ammending  \n");

			String nameUser = scanner1.nextLine();
			
			for (int i= 0; i<userList.size(); i++ ){
				
				if (nameUser.equals(userList.get(i).getName())){
					
					System.out.println("User Found\n");
					
					System.out.print("Which details would you like to ammend? Please choose either 1 or 2\n 1 - Name	or		2-User ID");
					
				   
					String sadf = scanner1.nextLine();
					int cond = Integer.parseInt(sadf);
					
					switch(cond){
					
					case 1:
						System.out.print("Please enter the User's new name:");
						
						String nameUser1 = scanner1.nextLine();
						
						userList.get(i).setName(nameUser1);
						
						System.out.print("The User's name has been changed to: "+userList.get(i).getName() + "\n\n");

						
						break;
						
					case 2:
						
						System.out.print("Please enter the User's new ID:");

						   
						String sauf = scanner1.nextLine();
						int numID = Integer.parseInt(sauf);
						
						
						userList.get(i).setID(numID);
						
						System.out.print("The User's ID has been changed to: "+userList.get(i).getID()+"\n\n");
						
						
						break;
					
					}
					
					
					
					i = userList.size();
					
				}
				System.out.print("Another Function? \ny=yes\nn=no.");
				 cont = scanner1.nextLine();
			}
			
			
			break;
			
		case 7:
			//Check in Book
			
			String prettyVo876 = scanner1.nextLine();

			System.out.print("Please enter the name of the Book which you which to Check In  \n");

			String bookName2 = scanner1.nextLine();
			
			for (int i= 0; i<=bookLib.size(); i++ ){
				
				if (bookName2.equals(bookLib.get(i).getTitle())){
					
					System.out.println("Book Found\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					bookLib.get(i).setOnLoan(false);
					System.out.println("Book Checked in\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println("The on loan status of "+ bookLib.get(i).getTitle()+ " is now set to: "+bookLib.get(i).getOnLoan());

					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					i = bookLib.size();
				}
			}
			System.out.print("Another Function? \ny=yes\nn=no.");
			 cont = scanner1.nextLine();
			
		
			break;
			
		case 8:
			//Check out Book
			
			
			String prettyVoid6 = scanner1.nextLine();

			System.out.print("Please enter the name of the Book which you which to Check Out  \n");

			String bookName3 = scanner1.nextLine();
			
			for (int i= 0; i<bookLib.size(); i++ ){
				
				if (bookName3.equals(bookLib.get(i).getTitle())){
					
					System.out.println("Book Found\n");
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					bookLib.get(i).setOnLoan(true);
					System.out.println("Book Checked out\n");
					
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("The on loan status of "+ bookLib.get(i).getTitle()+ " is now set to: "+bookLib.get(i).getOnLoan());
					
					try {
						TimeUnit.SECONDS.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					i = bookLib.size();
				}
			}
		
			System.out.print("Another Function? \ny=yes\nn=no.");
			 cont = scanner1.nextLine();
			break;
		
			
			
			
		case 9: 
			//Output all books
			
			for (int i= 0; i<bookLib.size(); i++ ){
								
				bookLib.get(i).outputALL();
				System.out.println("");

			}
			
			System.out.println("");
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Another Function? \ny=yes\nn=no.");
			 cont = scanner1.nextLine();
			
			
			break;
			
		}
		
		
		}
		
		
		
		// 
		//Create the list to store books
		//List<Book> bookLib = new ArrayList<Book>();
		
		//Create a book
		//Book prideAndPrejudice = new bookBuilder(349182734, "Jane Austen").title("Pride and Prejudice").build();
		//User Samwell22 = new User("Sam", 22);
		
		//Add a book to lib
		//bookLib.add(prideAndPrejudice);
		
		//Check the book out
		//checkOut(prideAndPrejudice );
		
		//System.out.println(library.get(0).author);
		//System.out.println(prideAndPrejudice.onLoan);
		
		
		
	}
}
