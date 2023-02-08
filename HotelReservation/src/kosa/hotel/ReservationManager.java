package kosa.hotel;

import java.util.Scanner;

public class ReservationManager {
	Scanner sc = new Scanner(System.in);
	Reservation r;
	
	public ReservationManager() {}
	
	public void makeReservation(Customer customer) {
		int totalPrice = 0;
		boolean roomState = false;
		System.out.println("객실 타입 선택해주세요.");
		System.out.println("1. 디럭스 2. 스위트");
		String roomType = sc.nextLine();
		System.out.println("입실날짜 입력해주세요. ex) 20230201");
		String startDate = sc.nextLine();
		System.out.println("퇴실날짜 입력해주세요.ex) 20230208");
		String endDate = sc.nextLine();
		r = new Reservation(customer, "객실정보", startDate, endDate, totalPrice, roomState = true);
		// 위줄 에러나는 이유는 객실정보 Room 객체를 안넣어기 때문이다.
		
	}
	
	public void checkReservation() {
		//예약 리스트 출력
	}
	
	public void updateReservation() {
		//수정할 예약 선택
		//데이터 업데이트
	}
	
	public void cancelReservation() {
		// 취소할 예약 선택
		// 리스트에서 삭제
	}
	
	public void checkIn(String reservationNo) {
		// 예약 번호를 입력받아서 예약리스트에 해당 예약번호가 있다면 
		// 체크인 완료 
	}
	
	public void checkOut(String roomNum) {
		// 객실번호를 받아서 해당 객실 번호의 예약 상태 업데이트(다시 예약할 수 있는 방으로 돌아가는 것)
	}
	

	

	
}
