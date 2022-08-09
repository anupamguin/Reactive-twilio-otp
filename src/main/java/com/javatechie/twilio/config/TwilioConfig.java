package com.javatechie.twilio.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfig {
	private String accountSid;
	private String authToken;
	private String trialNumber;

	public String getAccountSid() {
		return accountSid;
	}

	public String getAuthToken() {
		return authToken;
	}

	public String getTrialNumber() {
		return trialNumber;
	}

	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public void setTrialNumber(String trialNumber) {
		this.trialNumber = trialNumber;
	}

}
