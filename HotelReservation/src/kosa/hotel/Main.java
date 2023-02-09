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
		System.out.println("<5성급 '다놀자' 호텔 예약사이트 입니다.>");
		System.out.println("================================");
		
		CustomerManager cm = new CustomerManager();
		
		cm.addCustomer();


}

