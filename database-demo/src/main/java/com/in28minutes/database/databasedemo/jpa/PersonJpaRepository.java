package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

//Need to identify that this is a Repository.

//Need to do transaction management in here. This is important whenever we insert or delete rows or interact with the database.
//Whenever, we do multiple updates in one transaction, we either want all to be successful or all to fail.
//Ideally, transactions are implemented in the business layer.
@Repository
@Transactional
public class PersonJpaRepository {

	// connect to the database.

	@PersistenceContext
	EntityManager entityManager;

	// We need to write a HQL for findAll Method. Hibernate Query Language. in JPA,
	// we need to write a JPQL - Java Persistence Query Language
	public List<Person> findAll() {
		TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
	}

	public Person findbyId(int id) {
		return entityManager.find(Person.class, id);
	}

	public Person update(Person person) {
		return entityManager.merge(person);
	}

	public Person insert(Person person) {
		return entityManager.merge(person);
	}

	public void deleteById(int id) {
		Person person = findbyId(id);
		entityManager.remove(person);
	}

}
