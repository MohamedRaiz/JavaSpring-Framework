package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
		// Logic for quick sort algorithm
		return numbers;
	}
}
