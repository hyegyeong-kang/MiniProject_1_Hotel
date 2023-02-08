package kosa.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Customer> customers = new ArrayList<Customer>();
	//static List<NonCustomer> nonCustomers = new ArrayList<NonCustomer>();
	static Scanner sc = new Scanner(System.in);
	static boolean loginChk;
	static ReservationManager rm = new ReservationManager();
	
	public static void main(String[] args) {
		
		 
		
		System.out.println("1.회원 2.비회원");
		String memChk = sc.nextLine();
		
	
		
		
		
		Customer c = LoginChk(memChk);
		if (LoginChk(memChk) instanceof Customer) {
			System.out.println("1.객실 예약 2.예약 조회 3.예약 변경 4.예약 취소 5.종료");
			String chk = sc.nextLine();
			switch(chk) {
			case "1":
				rm.makeReservation(c); // 고객 정보 파라미터로 넘겨줘야할듯 
				break;
			case "2":
				rm.checkReservation();
				break;
			case "3":
				rm.updateReservation();
				break;
			case "4":
				rm.cancelReservation();
				break;
			case "5":
				return;
				
			}
		}
		
	
	}
	
	public static Customer LoginChk(String chk) {
		if (chk == "1") {
			System.out.println("아이디를 입력하세요.");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String pw = sc.nextLine();
			for (Customer customer : customers) {
				if (customer.getId().equals(id) && customer.getpw().equals(pw)){
					System.out.println("로그인 되었습니다. 업무를 선택하세요.");
					return customer;
				}else {
					System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
					return null;
				}
			}
		} else if (chk == "2") { // 비회원은 무조건 예약이 되어있음 
			System.out.println("이름을 입력하세요.");
			String name = sc.nextLine();
			System.out.println("예약번호를 입력하세요.");
			String reservationNo = sc.nextLine();
	
		}
	}
}
