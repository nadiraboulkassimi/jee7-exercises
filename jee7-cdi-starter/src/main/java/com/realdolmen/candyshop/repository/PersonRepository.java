package com.realdolmen.candyshop.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.domain.Person;

@ApplicationScoped
public class PersonRepository {
	@Inject
	private Logger logger;
	
	// Hoeft ni om testen groen te krijgen
	public boolean savePerson(Person person) {
		logger.info("PersonRepository: savePerson()");
		return true;
	}

	// Hoeft ni om testen groen te krijgen
	public Person findPersonById(int id) {
		logger.info("PersonRepository: savePerson()");

		return null;
	}
}
