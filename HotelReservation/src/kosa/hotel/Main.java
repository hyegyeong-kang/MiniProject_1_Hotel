package kosa.hotel;

public class Main {

	public static void main(String[] args) {
		System.out.println("<5성급 '다놀자' 호텔 예약사이트 입니다.>");
		System.out.println("================================");
		
		CustomerManager cm = new CustomerManager();
		
		cm.joinCustomer();

	}

}