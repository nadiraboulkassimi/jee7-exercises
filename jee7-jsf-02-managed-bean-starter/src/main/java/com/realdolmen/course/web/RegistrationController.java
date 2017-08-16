package com.realdolmen.course.web;

import com.realdolmen.course.domain.Person;
import com.realdolmen.course.repository.PersonRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;
import java.util.List;

/**
 * Created by NAUAZ44 on 16/08/2017.
 */
@RequestScoped
@Named
public class RegistrationController {
    @Inject
    PersonRepository pr;
    
    public Person getPerson(){
        //Person person = new Person("My FirstName","My LastName",new Date());
        return pr.findById(1L);
    }

    public List<Person> personList(){
        //Person person = new Person("My FirstName","My LastName",new Date());
        return pr.findAll();
    }
}
