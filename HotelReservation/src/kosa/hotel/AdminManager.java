package kosa.hotel;

public class AdminManager {
	ReservationManager rm = new ReservationManager();
	PayManager pm = new PayManager();
	
	public AdminManager() {}
	
	public void printAllReservation() { 
		// 전체 예약 내역 조회 
		rm.printAllReservation();
	}
	
	public void manageNoShow() { 
		// 노쇼 처리 
		
		rm.cancleNoshowReservation();
	}
	
	public void managePay() { // 결제 처리 
		
	}
}
