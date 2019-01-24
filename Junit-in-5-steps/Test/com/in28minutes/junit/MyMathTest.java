package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathTest {

	// MyMath.sum
	// 1,2,3 => 6

	@Test
	public void sum_with3numbers() {
		MyMath myMath = new MyMath();
		int result = myMath.sum(new int[] { 1, 2, 3 });

		// Check that result is 6
		// check result==6
		assertEquals(5, result);

		System.out.println(result);

	}

}
