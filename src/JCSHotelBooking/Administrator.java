package JCSHotelBooking;

import java.util.ArrayList;

public class Administrator extends Person{
	
	private String password;
	private ArrayList <User> users = new ArrayList();

	public String getPassword(){
		if (getHasPassword())
			return this.password;
		return "";
	}
	
	public String getUserType() {
		return "administrator";
	}

	public void addUser(User user){
		users.add(user);
	}
	
	//cancreateUser
	
	//canEdit existing users
	
	//
}
