package com.in28minutes.mockito.mockitodemo;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
	int[] retrieveAllData();
}