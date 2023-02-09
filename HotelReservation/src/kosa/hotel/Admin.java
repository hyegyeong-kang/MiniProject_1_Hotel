package kosa.hotel;

public class Admin {
	private String adminName;
	private String adminNo;



	public Admin() {}

	public Admin(String adminName, String adminNo) {
		super();
		this.adminName = adminName;
		this.adminNo = adminNo;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(String adminNo) {
		this.adminNo = adminNo;
	}


}

