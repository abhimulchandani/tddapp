package com.db.tddapp;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEmail {

	@Test
	public void testEmailSubject() {
		//fail();
		Email email = new Email("abc@gmail.com", "Hello World", "Hi, PFA the document you requested.");
		int emailSubjectLength = email.getEmailSubject().length();
		assertTrue(emailSubjectLength <= 25);
	}
	
	@Test
	public void testEmailSubjectNotNull() {
		//fail();
		Email email = new Email("abc@gmail.com", "Hello World", "Hi, PFA the document you requested.");
		assertNotNull(email.getEmailSubject());
	}
	
	@Test
	public void testEmailSubjectLength() {
		//fail();
		Email email = new Email("abc@gmail.com", "Hello World");
		int emailSubjectLength = email.getEmailSubject().length();
		assertNotEquals(emailSubjectLength, 0);
	}
	
	@Test
	public void testEmailSend() {
		Email email = new Email("abc@gmail.com", "Hello World", "Hi, PFA the document you requested.");
		
		
		long startTime = System.nanoTime();
		email.sendMail();
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
		assertTrue(duration/1000000 < 300000);
	}
}
