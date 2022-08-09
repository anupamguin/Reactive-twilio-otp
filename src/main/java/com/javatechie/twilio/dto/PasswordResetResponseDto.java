package com.javatechie.twilio.dto;

public class PasswordResetResponseDto {

	private OtpStatus status;
	private String message;

	public PasswordResetResponseDto() {
		super();
	}

	public PasswordResetResponseDto(OtpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public OtpStatus getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public void setStatus(OtpStatus status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
