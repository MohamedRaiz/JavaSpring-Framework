package com.in28minutes.mockito.mockitodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeBusinessImpl {

	@Autowired
	private DataService dataService;

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		System.out.println("The smallest integer now is: " + greatest);
		for (int value : data) {
			if (value > greatest) {
				greatest = value;
				System.out.println("The largest integer is now : " + greatest);
			}

		}
		return greatest;
	}
}
