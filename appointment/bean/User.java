package appointment.bean;

import java.math.BigInteger;

public class User {
	
	private String userId;
	private String userName;
	private String gender;
	private BigInteger contactNo;
	private String emaiId;
	
	public User(String userId, String userName, String gender, BigInteger contactNo, String emaiId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.contactNo = contactNo;
		this.emaiId = emaiId;
	}

	public String getUserId() {
		int count=0;
		++count;
		return userId+count;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
	
	
}
