package kosa.hotel;

public class Customer {
	private String cusId;
	private String cusPw;
	private String cusName;
	private String phoneNo;
	private String email;
	
	public Customer() {}

	public Customer(String cusId, String cusPw, String cusName, String phoneNo, String email) {
		super();
		this.cusId = cusId;
		this.cusPw = cusPw;
		this.cusName = cusName;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusPw() {
		return cusPw;
	}

	public void setCusPw(String cusPw) {
		this.cusPw = cusPw;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
