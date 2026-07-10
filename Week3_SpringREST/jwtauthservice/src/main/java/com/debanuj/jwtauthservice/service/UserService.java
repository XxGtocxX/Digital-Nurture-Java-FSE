package com.debanuj.jwtauthservice.service;

import com.debanuj.jwtauthservice.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final User user =
            new User("admin", "password");

    public boolean validate(String username,
                            String password) {

        return user.getUsername().equals(username)
                &&
                user.getPassword().equals(password);

    }

}