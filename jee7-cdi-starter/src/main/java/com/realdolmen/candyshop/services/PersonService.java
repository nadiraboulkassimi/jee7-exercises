package com.realdolmen.candyshop.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.domain.Person;
import com.realdolmen.candyshop.repository.PersonRepository;

@ApplicationScoped
public class PersonService {
	@Inject
	private Logger logger;
	@Inject
	private PersonRepository personRepository;

	// Hoeft ni om testen groen te krijgen
	public boolean savePerson(Person person) {
		logger.info("PersonService: savePerson()");
		return personRepository.savePerson(person);
	}

	public Person findPersonById(int id) {
		logger.info("PersonService: findPersonById()");
		return personRepository.findPersonById(id);
	}

	public PersonRepository getPersonRepository() {
		logger.info("PersonService: getPersonRepository()");
		return personRepository;
	}
}
