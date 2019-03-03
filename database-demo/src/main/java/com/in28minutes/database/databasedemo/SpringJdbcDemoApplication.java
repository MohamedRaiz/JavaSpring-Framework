package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication - commmented cuz we using JPA
public class SpringJdbcDemoApplication implements CommandLineRunner {

	// what would i need to talk to the database.
	@Autowired
	PersonJdbcDAO dao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Here, we would want to write our query
		logger.info("All users -> {}", dao.findAll());
		logger.info("User Id 10023 -> {}", dao.findbyId(10023));
		logger.info("Deleting an Id. No of rows Deleted -> {}", dao.deleteById(10901));
		logger.info("Inserting a Person -> {}", dao.insert(new Person(10101, "JohnnyD", "Africa", new Date())));
		logger.info("Update 10023 -> {}", dao.update(new Person(10023, "Javier", "Argentina", new Date())));

	}

}
