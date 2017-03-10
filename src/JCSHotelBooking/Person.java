package JCSHotelBooking;

public class Person {

	private int ID;
	private String firstName;
	private String lastName;
	private boolean hasUsername;
	private boolean hasPassword;
	private String emailAddress;
	private String streetAdress;
	private String userType;
	
	public Person(){
		
	}
	
	public Person(int ID, String firstName, String lastName, String streetAdress, String userType) {//clients may not have credentials
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAdress = streetAdress;
		this.userType = userType;
	}
	
	public Person(String firstName, String lastName, boolean hasUsername, boolean hasPassword, String emailAddress, String streetAdress, String userType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hasUsername = hasUsername;
		this.hasPassword = hasPassword;
		this.emailAddress = emailAddress;
		this.streetAdress = streetAdress;
		this.userType = userType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getHasUsername() {
		return false;
	}

	public void getHasUsername(boolean hasUsername) {
		this.hasUsername = hasUsername;
	}

	public boolean getHasPassword() {
		return false;
	}

	public void setPassword(boolean password) {
		this.hasPassword = password;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	/*public String toString(){
	
	}*/
		
}
