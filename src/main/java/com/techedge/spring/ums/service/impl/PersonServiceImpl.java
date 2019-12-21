package com.techedge.spring.ums.service.impl;

import com.techedge.spring.ums.data.entity.Person;
import com.techedge.spring.ums.data.repository.PersonRepository;
import com.techedge.spring.ums.mapper.PersonMapper;
import com.techedge.spring.ums.model.PersonDetail;
import com.techedge.spring.ums.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    PersonMapper personMapper;

    @Override
    public PersonDetail addPerson(PersonDetail personDetail) {
        Person person = personMapper.map(personDetail);
        personRepository.save(person);
        return personDetail;
    }

    @Override
    public List<PersonDetail> getAllPerson() {
        List<PersonDetail> personDetails = new ArrayList<>();
        personRepository.findAll().forEach(person -> personDetails.add(personMapper.map(person)));
        return personDetails;
    }
}
