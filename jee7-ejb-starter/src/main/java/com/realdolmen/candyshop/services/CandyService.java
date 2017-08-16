package com.realdolmen.candyshop.services;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.domain.CandyColor;
import com.realdolmen.candyshop.repository.CandyRepository;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

// TODO Make this component a Stateless Session Bean and make its methods accessible remotely

//@ApplicationScoped
@Stateless
public class CandyService implements CandyServiceRemote {
	@Inject
	CandyRepository candyRepository;

	@Inject
	PersonService personService;

	public CandyRepository getCandyRepository() {
		return candyRepository;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public List<Candy> findAllCandy() {
		return candyRepository.findAllCandy();
	}

	public List<Candy> findCandyByColor(CandyColor candyColor) {
		return candyRepository.findCandyByColor(candyColor);
	}
}
