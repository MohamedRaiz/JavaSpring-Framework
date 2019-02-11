package com.in28minutes.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusinessImpl businessImpl;

	@Test
	public void testfindTheGreatestFromAllData() {
		// we want to create a mock of the data service.
		// DataService dataServiceMock = mock(DataService.class); // instead of writing
		// this manually, we can use
		// annotation

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 30 });

		// SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock); // i
		// can also create the businessImpl.
		// and make sure all the things are set
		// properly. Make sure that this
		// dataServiceMock is injected into the
		// businessImpl.
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(30, result);
	}

	@Test
	public void testfindTheGreatestFromAllData_NoValue() {

		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});

		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}

}