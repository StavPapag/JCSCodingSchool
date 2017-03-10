package JCSHotelBooking;

public class Review {

	private String title;
	private String reviewDescription;
	
	public Review(String title, String reviewDescription) {
		super();
		this.title = title;
		this.reviewDescription = reviewDescription;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReviewDescription() {
		return reviewDescription;
	}

	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}
	
	
	
	
	
}
