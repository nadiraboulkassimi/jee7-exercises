package com.realdolmen.candyshop.repository;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.domain.Person;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CandyRepository {
	EntityManager em;

	public double findAverageCandyPrice() {
		double avg = (double) em.createQuery("SELECT avg(c.price) FROM Candy c").getSingleResult();
		return avg;
	}

	public List<Candy> findCandyByNameLike(String name) {
		TypedQuery<Candy> q = em.createQuery("SELECT c FROM Candy c WHERE c.name LIKE :name", Candy.class)
				.setParameter("name", "%" + name + "%");
		List<Candy> candies = q.getResultList();
		return candies;
	}

	public List<Candy> findUniqueCandyForPersonOrderHistory(Person p) {
		TypedQuery<Candy> q = em.createQuery(
				"select distinct ol.candy from Person p join p.orderHistory o join o.orderLines ol where p = :person Order by ol.candy.name",
				Candy.class).setParameter("person", p);
		List<Candy> candies = q.getResultList();
		return candies;
	}
}
