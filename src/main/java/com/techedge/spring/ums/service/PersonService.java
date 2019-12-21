package com.techedge.spring.ums.service;

import com.techedge.spring.ums.model.PersonDetail;

import java.util.List;

public interface PersonService {

    public PersonDetail addPerson(PersonDetail personDetail);
    public List<PersonDetail> getAllPerson();
}
