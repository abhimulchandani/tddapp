package com.db.tddapp;

import java.util.Random;

public class Account {
	
	private long accountId;

	public long getAccountId() {
		return accountId;
	}

	public Account() {
		
		this.accountId = 100000000 + new Random().nextInt(900000000);

	}

	
	
	
	
}
