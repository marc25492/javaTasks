package Library;

public class User {

	String name;
	int id;
	
	User(String nam, int id){
		this.name= nam;
		this.id = id;
	}
	
	//SETTERS
	public void setName(String nameName){
			name = nameName;
		}
	public void setID(int id1){
		id = id1;
	}
	
	
	//GETTERS
	public String getName(){
			return name;
		}
	public int getID(){
		return id;
	}
	
	
}
