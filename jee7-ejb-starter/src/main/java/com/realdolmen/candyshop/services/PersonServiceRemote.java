package com.realdolmen.candyshop.services;

import java.util.List;

import com.realdolmen.candyshop.domain.Person;
import com.realdolmen.candyshop.repository.PersonRepository;

public interface PersonServiceRemote {
	Person savePerson(Person person);

	PersonRepository getPersonRepository();

	Person findPersonById(long id);

	List<Person> findAllPeople();
}
