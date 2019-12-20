package com.techedge.spring.ums.controller;

import com.techedge.spring.ums.model.UserDetail;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @CrossOrigin
    @GetMapping("user/all")
    public List<UserDetail> getAllUsers(){
       return new ArrayList<>();
    }

    @CrossOrigin
    @PostMapping(value = "/add",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserDetail addUser(@RequestBody  UserDetail userDetail){
        return userDetail;
    }

}

