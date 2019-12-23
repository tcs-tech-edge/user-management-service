package com.techedge.spring.ums.service;

import com.techedge.spring.ums.model.UserDetail;

import java.util.List;

public interface UserService {

    UserDetail addUser(UserDetail userDetail);

    List<UserDetail> getAllUsers();
}
