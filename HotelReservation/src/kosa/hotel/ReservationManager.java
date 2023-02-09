package kosa.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationManager {
	Scanner sc = new Scanner(System.in);
	Reservation r;
	List<Reservation> reservations = new ArrayList<Reservation>();

	Room room1 = new Room("스위트룸", "714", 50000, 3, 1);
	Room room2 = new Room("디럭스룸", "815", 100000, 2, 1);
	
	public ReservationManager() {}
	
	public void makeReservation(Customer customer) {
		int totalPrice = 0;
		boolean roomState = false;
		System.out.println("=> 객실 타입 선택해주세요.");
		System.out.print("1. 디럭스 2. 스위트");
		String roomType = sc.nextLine();
		System.out.print("=> 입실날짜 입력해주세요. ex) 20230201 :");
		String startDate = sc.nextLine();
		System.out.print("=> 퇴실날짜 입력해주세요.ex) 20230208 : ");
		String endDate = sc.nextLine();
		String rNo = customer.getPhoneNo() + startDate; // 예약 번호 = 핸드폰번호 + 입실일
		switch(roomType) {
		case "1":
			reservations.add(new Reservation(customer, room1, startDate, endDate, totalPrice, roomState, rNo));
			break;
		case "2":
			reservations.add(new Reservation(customer, room2, startDate, endDate, totalPrice, roomState, rNo));
		}
		System.out.println("!!!!!!예약이 성공적으로 이루어졌습니다!!!!! 예약번호를 꼭 확인 부탁드립니다.");
		System.out.println("예약 번호: " + rNo);
	}
	
	public void checkReservation(Customer customer) {
		System.out.println("예약 번호를 입력해주세요.");
		String rNo = sc.nextLine();
		for (Reservation reservation : reservations) {
			if (reservation.getReservationNo().equals(rNo)) {
				System.out.println("이름: " + reservation.getCustomer().getCusName());
				System.out.println("객실 타입: " + reservation.getRoom().getRoomType());
				System.out.println("입실 날짜: " + reservation.getCheckInDate());
				System.out.println("퇴실 날짜: " + reservation.getCheckOutDate());
			}
		}
		System.out.println("");
	}
	
	
	public void cancelReservation() {
		  System.out.println("예약번호를 입력해주세요.");
		  String answer = sc.nextLine();  
		  for (int i = 0; i < reservations.size(); i++) {
			  if (reservations.get(i).getReservationNo().equals(answer)) {
				  reservations.remove(i);
				  System.out.println("예약을 취소하였습니다.");
			  } else {
				  System.out.println("예약 번호가 존재하지 않습니다.");
			  }
		  }
		}

	public void checkIn() {
		// 예약 번호를 입력받아서 예약리스트에 해당 예약번호가 있다면 
		// 체크인 완료 
		System.out.println("예약번호를 입력하세요.");
		
		String answer = sc.nextLine();
		
		for (int i = 0; i < reservations.size(); i++) {
			  if (reservations.get(i).getReservationNo().equals(answer)) {
				  reservations.get(i).setState(true);
				  System.out.println("체크인을 완료하였습니다.");
				  System.out.println("객실 번호: " + reservations.get(i).getRoom().getRoomNo());
			  } else {
				  System.out.println("예약 번호가 존재하지 않습니다.");
			  }
		}
		
	}
	
	public void checkOut() {
		// 객실번호를 받아서 해당 객실 번호의 예약 상태 업데이트(다시 예약할 수 있는 방으로 돌아가는 것)
		System.out.println("객실 번호를 입력하세요.");
		String num = sc.nextLine();
		for (int i = 0; i < reservations.size(); i++) {
			if (reservations.get(i).getRoom().getRoomNo().equals(num)) {
				reservations.remove(i);
				System.out.println("체크아웃을 완료하였습니다.");
			}
		}
	}
	
}
