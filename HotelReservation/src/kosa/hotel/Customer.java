package kosa.hotel;

public class Customer {
	private String cusName;
	private String phoneNo;
	private String birth;
	private String email;
	
	public Customer() {}

	public Customer(String cusName, String phoneNo, String birth, String email) {
		super();
		this.cusName = cusName;
		this.phoneNo = phoneNo;
		this.birth = birth;
		this.email = email;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
