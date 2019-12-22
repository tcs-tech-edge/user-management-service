package com.techedge.spring.ums.service;

import com.techedge.spring.ums.model.UserDetail;

import java.util.List;

public interface UserService {

    public UserDetail addUser(UserDetail userDetail);
    public List<UserDetail> getAllUsers();
}
