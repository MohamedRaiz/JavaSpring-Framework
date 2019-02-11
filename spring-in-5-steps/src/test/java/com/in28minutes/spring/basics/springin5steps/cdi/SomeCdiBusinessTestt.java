package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

//Load this context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTestt {

	// create Mock
	@Mock
	SomeCdiDao daoMock;

	// Once mock is createad, we would want to injectMock inside the business object
	@InjectMocks
	SomeCdiBusiness business;

	@Test
	public void testBasicScenario() {

		when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
		// when daoMock.getData() method is called, return hard coded value, return
		// int[] {2,4}
		// greatest is 4

		int result = business.findGreatest();

		assertEquals(4, result);
	}

	@Test
	public void testBasicScenario2() {

		when(daoMock.getData()).thenReturn(new int[] {});
		// when daoMock.getData() method is called, return hard coded value, return
		// int[] {2,4}
		// greatest is 4

		int result = business.findGreatest();

		assertEquals(Integer.MIN_VALUE, result);
	}

	@Test
	public void testBasicScenario_EqualElements() {

		when(daoMock.getData()).thenReturn(new int[] { 2, 2 });
		// when daoMock.getData() method is called, return hard coded value, return
		// int[] {2,4}
		// greatest is 4

		int result = business.findGreatest();

		assertEquals(2, result);
	}

}
