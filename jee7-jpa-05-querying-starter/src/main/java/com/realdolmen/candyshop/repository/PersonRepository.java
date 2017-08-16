package com.realdolmen.candyshop.repository;

import com.realdolmen.candyshop.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.util.List;

public class PersonRepository {
	EntityManager em;

	public Person findPersonById(long id) {
		return em.find(Person.class, id);
	}

	public List<Person> findAllPeople() {
		TypedQuery<Person> persons = em.createNamedQuery("find all people", Person.class);
		return persons.getResultList();
	}

	public void savePerson(Person p) {
		em.persist(p);
	}

	public void deletePersonById(long id) {
		em.remove(findPersonById(id));
	}

	public void updatePerson(Person p) {
		em.merge(p);
	}

	public long countAllPeople() {
		long count = (long) em.createQuery("SELECT count(p) FROM Person p").getSingleResult();
		return count;
	}

}
