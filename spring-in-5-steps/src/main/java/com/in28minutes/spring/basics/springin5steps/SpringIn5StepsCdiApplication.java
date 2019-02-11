package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps")
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class); // private static cuz
																								// outside of main

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsCdiApplication.class);

		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

		LOGGER.info("{}", business);

		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());

	}

}
