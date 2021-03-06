package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		// Bean identified via @Context
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new
		// BubbleSortAlgorithm()); dont need cuz spring will manage beans. So if i would
		// like to get the binary search from Spring,this can be done via Spring
		// context. --> SpringApplication.run(Springin5StepsApplication.class, args)

		// Dependencies identified via @Autowired

		// Application Context would be managing all the beans. Thus, we need to get the
		// beans from the app context.
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3); // first one is an array consisting of 12,4,6
		// 3 is the number looking for.

		System.out.println(result);

		applicationContext.close();

	}

}
