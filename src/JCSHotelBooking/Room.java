package JCSHotelBooking;

public class Room {
	
	private int id;
    private int floor;
    private String bedOption;
    private int numberOfBeds;
    private int price;
    private int roomSize;
    private boolean isReserved;
    
	public Room(int id, int floor, String bedOption, int numberOfBeds, int price, int roomSize, boolean isReserved) {
		this.id = id;
		this.floor = floor;
		this.bedOption = bedOption;
		this.numberOfBeds = numberOfBeds;
		this.price = price;
		this.roomSize = roomSize;
		this.isReserved = isReserved;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getBedOption() {
		return bedOption;
	}

	public void setBedOption(String bedOption) {
		this.bedOption = bedOption;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}

	public boolean isReserved() {
		return isReserved;
	}

	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
    
    

}
