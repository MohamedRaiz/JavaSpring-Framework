package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	// what would i need to talk to the database.
	@Autowired
	PersonSpringDataRepository repository;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Here, we would want to write our query
		logger.info("User Id 10023 -> {}", repository.findById(10023));

		logger.info("Inserting a Person -> {}", repository.save(new Person("JohnnyD", "Africa", new Date())));

		logger.info("Update 10023 -> {}", repository.save(new Person(10023, "Javier", "Argentina", new Date())));

		// As delete returns nothing, we cant use logger
		repository.deleteById(10901);

		logger.info("All users -> {}", repository.findAll());

	}

}
