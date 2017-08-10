package com.realdolmen.candyshop.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.jboss.logging.Logger;

import com.realdolmen.candyshop.domain.Candy;

@ApplicationScoped
public class CandyRepository {
	@Inject
	private Logger logger;
	
	// Hoeft ni om testen groen te krijgen
	public List<Candy> saveCandy() {
		logger.info("CandyRepository: saveCandy()");

		return null;
	}

	// Hoeft ni om testen groen te krijgen
	public List<Candy> findAllCandy() {
		logger.info("CandyRepository: findAllCandy()");

		return null;
	}

	// Hoeft ni om testen groen te krijgen
	public Candy findCandyByColor() {
		logger.info("CandyRepository: findCandyByColor()");

		return null;
	}
}
