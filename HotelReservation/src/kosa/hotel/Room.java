package kosa.hotel;

public class Room {
	private String roomType;
	private String roomNo;
	private int price;
	private int maxPeopleNum;
	private int roomAmount;

	public Room() {}

	public Room(String roomType, String roomNo, int price, int maxPeopleNum, int roomAmount) {
		super();
		this.roomType = roomType;
		this.roomNo = roomNo;
		this.price = price;
		this.maxPeopleNum = maxPeopleNum;
		this.roomAmount = roomAmount;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaxPeopleNum() {
		return maxPeopleNum;
	}

	public void setMaxPeopleNum(int maxPeopleNum) {
		this.maxPeopleNum = maxPeopleNum;
	}

	public int getRoomAmount() {
		return roomAmount;
	}

	public void setRoomAmount(int roomAmount) {
		this.roomAmount = roomAmount;
	}

}
