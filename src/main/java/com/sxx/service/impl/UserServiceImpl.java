package com.sxx.service.impl;

import com.sxx.entity.User;
import com.sxx.repository.UserRepository;
import com.sxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user) {
        user.setCreateTime(new Date());
        return repository.save(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void delUser(Integer id) {
        if (repository.exists(id)) {
            repository.delete(id);
        }
    }
}
