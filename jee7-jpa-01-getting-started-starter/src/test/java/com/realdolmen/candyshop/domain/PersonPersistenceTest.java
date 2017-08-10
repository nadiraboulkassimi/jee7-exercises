package com.realdolmen.candyshop.domain;

import com.realdolmen.candyshop.AbstractPersistenceTest;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: use the AbstractPersistence Test
public class PersonPersistenceTest extends AbstractPersistenceTest {

	// TODO: add unit test personCanBePersisted()
	@Test
	public void personCanBePersisted() {
		try {
			Person p = new Person();
			p.setFirstName("Nadir");
			p.setLastName("Ab");
			em.persist(p);
			assertNotNull(p.getId());
		} catch (Exception e) {
			fail();
		}

	}

	// TODO: add unit test personCanBeLoaded()
	@Test
	public void personCanBeLoaded() {
		try {
			String firstname = "John";
			Person p = (Person) em.find(Person.class, 1000L);
			// Person p = (Person) em.createQuery("SELECT p FROM Person p WHERE
			// p.firstName =:firstname").setParameter("firstname",
			// firstname).getSingleResult();
			assertNotNull(p);
			assertTrue("John".equals(p.getFirstName()));
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
		/*
		 * Person person = em.find(Person.class, 1000L); assertEquals("John",
		 * person.getFirstName()); assertEquals("Doe", person.getLastName());
		 */
	}
}
