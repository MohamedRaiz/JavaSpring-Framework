package com.in28minutes.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTest {

	@Test
	public void test() {

		// assertEquals(1, 1); // if same pass, if different fails.

		boolean condn = true;
		assertTrue(condn); // used to check whether a condition is true.
		assertFalse(condn); // used to check whether a condition is false

		// assertArrayEquals(expected, actual); // to check whetehr two arrays are equal

	}

}
