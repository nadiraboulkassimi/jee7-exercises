package com.realdolmen.candyshop.services;

import java.util.List;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.domain.CandyColor;
import com.realdolmen.candyshop.repository.CandyRepository;

public interface CandyServiceRemote {

	CandyRepository getCandyRepository();

	PersonService getPersonService();

	List<Candy> findAllCandy();

	List<Candy> findCandyByColor(CandyColor candyColor);
}