package model;

public class UserBean {
	private String userName;
	private String passWord;
	private String rePassWord;
	private String userType;

	public UserBean() {

	}

	public UserBean(String usr, String pass, String rePass, String userType) {
		userName = usr;
		passWord = pass;
		rePassWord = rePass;
		this.userType = userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserName(String usr) {
		userName = usr;
	}

	public String getUserName() {
		return userName;
	}

	public void setPassword(String pass) {
		passWord = pass;
	}

	public String getPassword() {
		return passWord;
	}

	public void setRePassword(String rePass) {
		rePassWord = rePass;
	}

	public String getRePassword() {
		return rePassWord;
	}

}
