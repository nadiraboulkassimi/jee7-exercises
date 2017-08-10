package com.realdolmen.candyshop.web;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.services.CandyService;

@RequestScoped
public class CandyController {
	@Inject
	private Logger logger;
	@Inject
	private CandyService candyService;

	// Hoeft ni om testen groen te krijgen
	public List<Candy> saveCandy() {
		logger.info("CandyController: saveCandy()");
		return candyService.saveCandy();
	}
	
	public List<Candy> findAllCandy() {
		logger.info("CandyController: findAllCandy()");
		return candyService.findAllCandy();
	}

	public Candy findCandyByColor() {
		logger.info("CandyController: findCandyByColor()");
		return candyService.findCandyByColor();
	}

	public CandyService getCandyService() {
		logger.info("CandyController: getCandyService()");
		return candyService;
	}
}
