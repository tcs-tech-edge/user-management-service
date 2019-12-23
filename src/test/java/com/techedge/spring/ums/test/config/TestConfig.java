package com.techedge.spring.ums.test.config;

import com.techedge.spring.ums.mapper.UserMapper;
import com.techedge.spring.ums.service.UserService;
import com.techedge.spring.ums.service.impl.UserServiceImpl;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
public class TestConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

    @Bean
    public UserMapper userMapper() {
        return new UserMapper();
    }
}
