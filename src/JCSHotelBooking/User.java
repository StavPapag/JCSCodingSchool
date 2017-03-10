package JCSHotelBooking;

public class User extends Person{
	
	private String password;

	public String getPassword(){
		if (getHasPassword())
			return this.password;
		return "";
	}
	public String getUserType() {
		return "user";
	}

	//receiveCredentialsfromAdmin
	
}
