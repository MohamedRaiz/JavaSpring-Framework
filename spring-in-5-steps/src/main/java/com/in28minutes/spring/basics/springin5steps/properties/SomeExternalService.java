package com.in28minutes.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

	@Value("${external.service.url}") // need to have the "${}"
	private String url; // want this to be different in different environments Get this from property
						// file

	public String returnServiceURL() {

		return url;
	}
}
