package com.in28minutes.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDAO {

	// Typically we would need to establish a database connection in order to talk
	// to one. But now, we are using Spring. So we want Spring to give us the
	// database connection. This can be done via JdbcTemplate

	@Autowired
	JdbcTemplate jdbcTemplate;

	// Customize RowMapper here
	// RowMapper<Person> basically means it is the Person Bean that you want to map
	// the values to.
	class PersonRowMapper implements RowMapper<Person> {

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("Name"));
			person.setLocation(rs.getString("Location"));
			person.setBirthdate(rs.getTimestamp("birthdate"));
			return person;
		}
	}

	public List<Person> findAll() {
		return jdbcTemplate.query("Select * from Person", new PersonRowMapper());
	}

	public Person findbyId(int id) {
		return jdbcTemplate.queryForObject("Select * from Person where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

	public int deleteById(int id) {
		return jdbcTemplate.update("Delete from Person where id = ?", new Object[] { id });
	}

	public int insert(Person person) {
		return jdbcTemplate.update("INSERT INTO PERSON (ID, NAME, LOCATION, BIRTHDATE)VALUES (?,?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation(),
						new Timestamp(person.getBirthdate().getTime()) });

	}

	public int update(Person person) {
		return jdbcTemplate.update("Update PERSON SET name = ?, location = ?, Birthdate = ? where id = ?",
				new Object[] { person.getName(), person.getLocation(), new Timestamp(person.getBirthdate().getTime()),
						person.getId() });

	}

}
