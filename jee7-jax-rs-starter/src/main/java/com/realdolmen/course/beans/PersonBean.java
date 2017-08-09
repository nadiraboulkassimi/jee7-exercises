package com.realdolmen.course.beans;

import com.realdolmen.course.domain.Person;
import com.realdolmen.course.service.PersonServiceBean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class PersonBean {
    @EJB
    private PersonServiceBean personService;

    public List<Person> allPeople() {
        return personService.findAll();
    }

    public void remove(long personId) {
        personService.remove(personId);
    }
}
