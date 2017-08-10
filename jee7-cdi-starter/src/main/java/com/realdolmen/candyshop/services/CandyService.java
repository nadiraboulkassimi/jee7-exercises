package com.realdolmen.candyshop.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.repository.CandyRepository;

@ApplicationScoped
public class CandyService {
	@Inject
	private Logger logger;
	@Inject
	private CandyRepository candyRepository;
	@Inject
	private PersonService personService;

	// Hoeft ni om testen groen te krijgen
	public List<Candy> saveCandy() {
		logger.info("CandyService: saveCandy()");
		return candyRepository.saveCandy();
	}

	public List<Candy> findAllCandy() {
		logger.info("CandyService: findAllCandy()");
		return candyRepository.findAllCandy();
	}
	
	// Hoeft ni om testen groen te krijgen
	public Candy findCandyByColor() {
		logger.info("CandyService: findCandyByColor()");
		return candyRepository.findCandyByColor();
	}


	public CandyRepository getCandyRepository() {
		logger.info("CandyService: getCandyRepository()");
		return candyRepository;
	}

	public PersonService getPersonService() {
		logger.info("CandyService: getPersonService()");
		return personService;
	}
}
