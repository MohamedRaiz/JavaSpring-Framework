package com.in28minutes.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")

//want to load in app.properties
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

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
				SpringIn5StepsPropertiesApplication.class);

		SomeExternalService service = applicationContext.getBean(SomeExternalService.class);

		System.out.println(service.returnServiceURL());

		applicationContext.close();

	}

}
