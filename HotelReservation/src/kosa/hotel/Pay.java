package kosa.hotel;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pay {
	private Reservation reservation;
	private String payType;
	private LocalDate nowDate = LocalDate.now();
	private LocalTime nowTime = LocalTime.now();
	private boolean isPayed;
	
	public Pay() {}

	public Pay(Reservation reservation, String payType, LocalDate nowDate, LocalTime nowTime, boolean isPayed) {
		super();
		this.reservation = reservation;
		this.payType = payType;
		this.nowDate = nowDate;
		this.nowTime = nowTime;
		this.isPayed = isPayed;
	}
	
	public void showReceipt() {
//		if(reservation.getCheckout()==true && isPayed == false) {
			System.out.println("[ 영수증을 출력합니다. ]");
		}
//	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public LocalDate getNowDate() {
		return nowDate;
	}

	public void setNowDate(LocalDate nowDate) {
		this.nowDate = nowDate;
	}

	public LocalTime getNowTime() {
		return nowTime;
	}

	public void setNowTime(LocalTime nowTime) {
		this.nowTime = nowTime;
	}

	public boolean isPayed() {
		return isPayed;
	}

	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}
	
}

