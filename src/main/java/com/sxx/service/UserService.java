package com.sxx.service;

import com.sxx.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> findAll();

    void delUser(Integer id);
}
