package com.db.tddapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestAccountApp {

	@BeforeClass
	public static void beforeAllTests() {
		System.out.println("-------Before all tests--------");
	}	
	
	@Before
	public void beforeTest() {
		System.out.println("This will execute before every test");
	}
	
	@After
	public void AfterTest() {
		System.out.println("This will execute after every test");
	}
	
	@Test
	public void testCreateAccount() {
		//fail();
		Account account  = new Account();
		assertNotNull(account);
	}
	
	@Test
	public void testAccountIdNotNull() {
		//fail();
		Account account = new Account();
		Object expected = account.getAccountId();
		assertNotNull(expected);
	}
	
//	@Test(expected = Exception.class)
//	public void testAccountIdShorterLength() {
//		fail();
//	}
	
	
	@Test
	public void testAccountIdLength() {
		//fail();
		Account account = new Account();
		System.out.println(account.getAccountId());
		int expectedLength = 9;
		String accNo = String.valueOf(account.getAccountId());
		int actualLength = accNo.length();
		assertEquals(expectedLength, actualLength);
		
	}
	
//	@Test
//	public void testAccountNumeric() {
//		fail();
//	}

	@Test
	public void testAccountNonNegative() {
		Account account = new Account();
		long actualAccountId = account.getAccountId();
		assertNotEquals(actualAccountId, 0);
	}
	
//	@Test
//	public void testAccountStartWith9() {
//		fail();
//	}
	
	@Test
	@Ignore
	public void testAccountIdAsImmutable() {
		fail();
	}
	
}
