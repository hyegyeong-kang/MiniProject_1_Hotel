package kosa.hotel;

import java.time.LocalDate;

public class Reservation {
	private String reservationNo;
	

	private Customer customer;
	private Room room;
	private String checkInDate;
	private String checkOutDate;
	private int roomPrice; // 객실 비용 * 일수
	private boolean state; // 예약 상태
	private String ReservationNo;
	
	public Reservation() {}
	
	public Reservation(Customer customer, Room room, String checkInDate, String checkOutDate, int roomPrice,
			boolean state, String reservationNo) {
		super();
		this.customer = customer;
		this.room = room;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.roomPrice = roomPrice;
		this.state = state;
		this.reservationNo = reservationNo;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
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
	
	public String getReservationNo() {
		return reservationNo;
	}

	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}
	
}
