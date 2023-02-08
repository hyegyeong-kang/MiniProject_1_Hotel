package kosa.hotel;

import java.util.Scanner;

public class RoomManager {
	Room room = new Room();
	ReservationManager rm = new ReservationManager();
	Scanner sc = new Scanner(System.in);
	
	public RoomManager() {}
	
	public void searchRoom() {
		System.out.println("['다놀자'의 객실 목록입니다.]");
		System.out.println("=======================");
		System.out.println("1.디럭스");
		System.out.println("2.스위트\n");
		
		System.out.print("=> 원하는 객실 번호를 입력하세요. : ");
		String roomMenu = sc.nextLine();
		
		switch(roomMenu) {
		case "1"  :
			if(room.getRoomAmount() > 0) {
				System.out.println("디럭스 남은 수량 : " + room.getRoomAmount());
				System.out.println("\n예약을 진행하시겠습니까?");
				System.out.print("1.예   2.아니오");
				System.out.print("=> 입력 : ");
				String answer = sc.nextLine();
				
				switch(answer) {
				case "1" :
					rm.makeReservation();
					
					break;
				case "2" :
					System.out.println("예약 진행을 취소하였습니다.");
					break;
				default :
					System.out.println("없는 메뉴번호 입니다. 잘못 입력하셨습니다.");
				}
			}
			break;
		case "2"  : 
			System.out.println("스위트 남은 수량 : " + room.getRoomAmount());
			System.out.println("\n예약을 진행하시겠습니까?");
			System.out.print("1.예   2.아니오");
			System.out.print("=> 입력 : ");
			String answer = sc.nextLine();
			
			switch(answer) {
			case "1" :
				rm.makeReservation();
				break;
				
			case "2" :
				System.out.println("예약 진행을 취소하였습니다.");
				break;
				
			default :
				System.out.println("없는 메뉴번호 입니다. 잘못 입력하셨습니다.");
			break;
			}
		}
		
	}
}
