package com.db.tddapp;

import java.awt.List;

public class Email {

	private String emailId;
	private String emailSubject;
	private String emailBody;
	private List emailAttachment;
	
	public Email(String emailId, String emailSubject, String emailBody) {
		this(emailId, emailSubject, emailBody, null);
	}
	
	public Email(String emailId, String emailSubject, List emailAttachment) {
		this(emailId, emailSubject, null, emailAttachment);
	}
	
	public Email(String emailId, String emailSubject) {
		this(emailId, emailSubject, null, null);
	}
	
	public Email(String emailId, String emailSubject, String emailBody, List emailAttachment) {
		super();
		this.emailId = emailId;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.emailAttachment = emailAttachment;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public String getEmailBody() {
		return emailBody;
	}

	public List getEmailAttachment() {
		return emailAttachment;
	}

	public boolean sendMail() {
		System.out.println("Mail sent");
		return true;
	}
	
	
}
