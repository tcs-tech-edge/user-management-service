package com.techedge.spring.ums.controller;

import com.techedge.spring.ums.model.PersonDetail;
import com.techedge.spring.ums.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    PersonService personService;

    @CrossOrigin
    @GetMapping("person/list")
    public List<PersonDetail> getAllPerson(){
       return personService.getAllPerson();
    }

    @CrossOrigin
    @PostMapping(value = "/person/add",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public PersonDetail addPerson(@RequestBody PersonDetail personDetail){
        return personService.addPerson(personDetail);
    }

}

