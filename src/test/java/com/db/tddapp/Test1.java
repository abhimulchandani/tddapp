package com.db.tddapp;

import static org.junit.Assert.fail;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test1 {
	
	@Test()
	public void testZ() {
		System.out.println("Z");
	}
	
	@Test()
	public void testY() {
		System.out.println("Y");
	}
	
	@Test()
	public void testA() {
		System.out.println("A");
	}
	
	@Test()
	public void testB() {
		System.out.println("B");
	}
}
