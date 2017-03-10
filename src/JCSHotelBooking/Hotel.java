package JCSHotelBooking;

import java.awt.List;

public class Hotel {
	
	private int id;
    private String hotelName;
    private String streetAddress;
    private String zipCode;    
    private String cityName;
    private String emailAdressHotel;
    private int rating;
    private String checkInCheckOutHour;
    private int numberOfReviews;
    
    //private List <Room> rooms;
    //private List <PaymentMethod> paymentMethod;
    
	public Hotel(int id, String hotelName, String streetAddress, String zipCode, String cityName, String emailAdressHotel, int rating, String checkInCheckOutHour,
		     int numberOfReviews) {
		this.id = id;
		this.hotelName = hotelName;
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.emailAdressHotel = emailAdressHotel;
		this.rating = rating;
	    this.checkInCheckOutHour = checkInCheckOutHour;
	    this.numberOfReviews = numberOfReviews;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getEmailAdressHotel() {
		return emailAdressHotel;
	}

	public void setEmailAdressHotel(String emailAdressHotel) {
		this.emailAdressHotel = emailAdressHotel;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String getCheckInCheckOutHour() {
		return checkInCheckOutHour;
	}

	public void setCheckInCheckOutHour(String checkInCheckOutHour) {
		this.checkInCheckOutHour = checkInCheckOutHour;
	}
	

	public int getNumberOfReviews() {
		return numberOfReviews;
	}


	public void setNumberOfReviews(int numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}


}
