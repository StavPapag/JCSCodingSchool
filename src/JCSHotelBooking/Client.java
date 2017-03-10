package JCSHotelBooking;

public class Client extends Person{

	private static int numberOfBookings; //ekptwtikes prosfores analoga tn ari8mo
	private String password;

	public String getPassword(){
		if (getHasPassword())
			return this.password;
		return "";
	}
	
	public String getUserType() {
		return "client";
	}

	//book
	
	//cancelBooking
	
	//pay
	
	//readReviews
	
}
