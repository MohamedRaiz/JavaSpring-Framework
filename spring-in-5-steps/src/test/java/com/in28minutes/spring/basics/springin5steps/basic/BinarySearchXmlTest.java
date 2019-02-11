package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

//Load this context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/testContext.xml")
public class BinarySearchXmlTest {

	// get bean from context
	@Autowired
	BinarySearchImpl binarySearch;
	// Once the context is launched, that bean which is loaded would be autowired.

	@Test
	public void testBasicScenario() {
		// call method on binarySearch
		// check if value is correct

		int result = binarySearch.binarySearch(new int[] {}, 5);
		// first input is
		// the set of numbers, second is the
		// number to search for

		assertEquals(3, result);
	}

}
