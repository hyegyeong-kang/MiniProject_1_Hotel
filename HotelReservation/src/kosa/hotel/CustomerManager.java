package kosa.hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
	
	List<Customer> customers = new ArrayList<Customer>();
	Scanner sc = new Scanner(System.in);
	
	public CustomerManager() {}

	public Customer addCustomer() { // 고객 등록
		
		System.out.print("=> 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("=> 전화번호를 입력하세요 : ");
		String phoneNo = sc.nextLine();
		
		System.out.print("=> 이메일을 입력하세요 : ");
		String email = sc.nextLine();
		
		System.out.print("=> 생일을 입력하세요. : ");
		String birth = sc.nextLine();
		
		Customer c = new Customer(name, phoneNo, birth, email);
		customers.add(c);
		
		System.out.println("\"" + name + "\"" + "님의 정보 등록이 완료되었습니다.\n");
		
		return c;
	}
	
}
