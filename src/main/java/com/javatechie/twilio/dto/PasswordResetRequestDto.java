package com.javatechie.twilio.dto;

public class PasswordResetRequestDto {

	private String phoneNumber;// destination
	private String userName;
	private String oneTimePassword;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getOneTimePassword() {
		return oneTimePassword;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setOneTimePassword(String oneTimePassword) {
		this.oneTimePassword = oneTimePassword;
	}

}
