package kosa.hotel;

import java.util.Scanner;

public class ReservationManager {
	Scanner sc = new Scanner(System.in);
	Reservation r;

	Room room1 = new Room("스위트룸", "714", 50000, 3, 1);
	Room room2 = new Room("디럭스룸", "815", 100000, 2, 1);
	
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
		switch(roomType) {
		case "1":
			new Reservation(customer, room1, startDate, endDate, totalPrice, roomState);
			break;
		case "2":
			new Reservation(customer, room2, startDate, endDate, totalPrice, roomState);
		}		
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

	public void checkIn() {
		// 예약 번호를 입력받아서 예약리스트에 해당 예약번호가 있다면 
		// 체크인 완료 
		System.out.println("예약번호를 입력하세요.");
		String num = sc.nextLine();
		
	}
	
	public void checkOut() {
		// 객실번호를 받아서 해당 객실 번호의 예약 상태 업데이트(다시 예약할 수 있는 방으로 돌아가는 것)
	}
	
}
