package com.realdolmen.candyshop.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Person;
import com.realdolmen.candyshop.services.PersonService;

@RequestScoped
public class PersonController {
	@Inject
	private Logger logger;
	@Inject
	private PersonService personService;

	public boolean savePerson(Person person) {
		logger.info("PersonController: savePerson()");
		return personService.savePerson(person);
	}

	public Person findPersonById(int id) {
		logger.info("PersonController: findPersonById()");
		return personService.findPersonById(id);
	}

	public PersonService getPersonService() {
		logger.info("PersonController: getPersonService()");
		return personService;
	}
}