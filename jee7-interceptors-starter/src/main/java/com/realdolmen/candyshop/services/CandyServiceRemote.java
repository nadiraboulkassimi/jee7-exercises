package com.realdolmen.candyshop.services;

import com.realdolmen.candyshop.domain.Candy;
import com.realdolmen.candyshop.domain.CandyColor;
import com.realdolmen.candyshop.repository.CandyRepository;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by cda5732 on 1/03/2017.
 */
public interface CandyServiceRemote {
    CandyRepository getCandyRepository();

    List<Candy> findAllCandy();

    List<Candy> findCandyByColor(CandyColor candyColor);
}
