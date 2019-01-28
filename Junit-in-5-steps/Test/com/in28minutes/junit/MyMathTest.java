package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();

	@Before
	public void before() {
		System.out.println("Before");
	}

	@After
	public void after() {
		System.out.println("After");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Before");
	}

	// MyMath.sum
	// 1,2,3 => 6

	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		int result = myMath.sum(new int[] { 1, 2, 3 });

		// Check that result is 6
		// check result==6
		assertEquals(6, result);
	}

	@Test
	public void sum_with1numbers() {
		System.out.println("Test2");
		int result = myMath.sum(new int[] { 1 });

		// Check that result is 6
		// check result==6
		assertEquals(1, result);
	}

}
