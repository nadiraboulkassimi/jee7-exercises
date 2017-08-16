package com.realdolmen.candyshop.services;

import com.realdolmen.candyshop.domain.Person;
import com.realdolmen.candyshop.repository.PersonRepository;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

// TODO Make this component a Stateless Session Bean and make its methods accessible remotely
//@ApplicationScoped
@Stateless
public class PersonService implements PersonServiceRemote {
	@Inject
	PersonRepository personRepository;

	public Person savePerson(Person person) {
		personRepository.savePerson(person);
		return person;
	}

	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public Person findPersonById(long id) {
		return personRepository.findPersonById(id);
	}

	public List<Person> findAllPeople() {
		return personRepository.findAllPeople();
	}
}
