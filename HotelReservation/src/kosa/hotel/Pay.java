package kosa.hotel;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pay {
	private Reservation reservation; 
	private String payType; // 지불 유형
	private LocalDate nowDate = LocalDate.now(); // 현재 날짜 
	private LocalTime nowTime = LocalTime.now(); // 현재 시간 
	private boolean isPayed; // 지불 된 건인지 체
	
	public Pay() {}

	public Pay(Reservation reservation, String payType, LocalDate nowDate, LocalTime nowTime, boolean isPayed) {
		super();
		this.reservation = reservation;
		this.payType = payType;
		this.nowDate = nowDate;
		this.nowTime = nowTime;
		this.isPayed = isPayed;
	}

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

