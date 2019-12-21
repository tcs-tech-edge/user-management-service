package com.techedge.spring.ums.mapper;

import com.techedge.spring.ums.data.entity.Person;
import com.techedge.spring.ums.model.PersonDetail;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public Person map(PersonDetail personDetail){
        Person person = new Person();
        person.setFirstName(personDetail.getFirstName());
        person.setLastName(personDetail.getLastName());
        return person;
    }

    public PersonDetail map(Person person) {
        PersonDetail personDetail = new PersonDetail();
        personDetail.setFirstName(person.getFirstName());
        personDetail.setLastName(person.getLastName());
        return personDetail;
    }
}
