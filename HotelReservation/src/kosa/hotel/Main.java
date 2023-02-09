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
	
	public static void main(String[] args) {
		System.out.println("1.객실 예약  2.예약 확인  3.예약 취소  4.체크인  5.체크아웃  6.종료");
		String chk = sc.nextLine();
		switch(chk) {
		case "1":
			rm.makeReservation(cm.addCustomer());
			break;
		case "2":
			rm.checkReservation();
			break;
		case "3":
			rm.cancelReservation();
			break;
		case "4":
			rm.checkIn();
			break;
		case "5":
			rm.checkOut();
			return;
			
		}
	}
}

