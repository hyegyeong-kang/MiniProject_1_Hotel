package kosa.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Customer> customers = new ArrayList<Customer>();
	static Scanner sc = new Scanner(System.in);
	static boolean loginChk;
	static ReservationManager rm = new ReservationManager();
	static CustomerManager cm = new CustomerManager();
	static AdminManager am = new AdminManager();
	static Customer customer;
	static Admin admin;
	
	public static void main(String[] args) {
		while(true) {
			int idx = 0;
			
			System.out.println("1.객실 예약  2.예약 확인  3.예약 취소  4.체크인  5.체크아웃  6.관리자 메뉴  7.종료");
			String chk = sc.nextLine();
			switch(chk) {
			case "1":
				customer = cm.addCustomer();
				rm.makeReservation(customer);
				break;
				
			case "2":
				rm.checkReservation(customer);
				break;
				
			case "3":
				rm.cancelReservation();
				break;
				
			case "4":
				rm.checkIn();
				break;
				
			case "5":
				rm.checkOut();
				break;
				
			case "6":
				System.out.print("=> 관리자 아이디 입력 : ");
				String id = sc.nextLine();
				
				System.out.print("관리자 번호 입력 :");
				String pw = sc.nextLine();
				
				if (admin.getAdminNo().equals(id) && admin.getAdminNo().equals(pw)) {
					System.out.println("관리자 로그인에 성공하였습니다.\n");
					
					System.out.println("1.고객 전체 예약 내역 조회   2.no-show고객 취소처리");
					System.out.print("=> 입력 : ");
					String answer = sc.nextLine();
					
					switch(answer) {
					case "1" : 
						am.printAllReservation();
						break;
						
					case "2" :
						am.manageNoShow();
						break;
					
					default :
						System.out.println("메뉴를 잘못 입력셨습니다.");
						break;
					}
				}
				
				break;
				
			case "7":
				idx = -1;
				break;
				
			default:
				System.out.println("메뉴가 존재하지 않습니다. 다시 입력해주세요.");
			}
			
			if (idx == -1) {
				System.out.println("예약 프로그램을 종료합니다.");
			}
		}
	}
}

