package com.realdolmen.course.web;

import com.realdolmen.course.domain.Person;
import com.realdolmen.course.repository.PersonRepository;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by NAUAZ44 on 16/08/2017.
 */
@Named("mySuperDuperMegaSweetControllerBean")
public class MySpecialController {

    @Inject
    private PersonRepository pr;

    public int calculatePurposeOfLife() {
        return 5 * 8 + 2;
    }

    public Person findPerson() {
        return pr.findById(1000L);
    }
}
