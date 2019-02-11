package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SomeBusinessMockTest {

	@Test
	public void testfindTheGreatestFromAllData() {
		// we want to create a mock of the data service.
		DataService dataServiceMock = mock(DataService.class);

		// dataServiceMock.retrieveAllData() => new int [] {24,15,3}; basically when i
		// call dataServiceMock. retrieve all, i would want them to return all this
		// value back.
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 30 });
		// This means that when this method is called on, i would want
		// to
		// return an integer of 24,15,3

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

	@Test
	public void testfindTheGreatestFromAllData_ForOneValue() {
		// we want to create a mock of the data service.
		DataService dataServiceMock = mock(DataService.class);

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 15 });

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
	}

}