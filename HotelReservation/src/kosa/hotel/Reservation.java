package kosa.hotel;

import java.util.Date;

public class Reservation {
	private String num;
	private Customer customer;
	private Room room;
	private Date checkInDate;
	private Date checkOutDate;
	private int roomPrice; // 객실 비용 * 일수
	private boolean state; // 예약 상태
	
	public Reservation() {}
	
	public Reservation(String num, Customer customer, Room room, Date checkInDate, Date checkOutDate, int roomPrice,
			boolean state) {
		super();
		this.num = num;
		this.customer = customer;
		this.room = room;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomPrice = roomPrice;
		this.state = state;
	}
	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(int roomPrice) {
		this.roomPrice = roomPrice;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
}
