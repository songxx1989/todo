package com.sxx.controller;

import com.sxx.entity.Result;
import com.sxx.entity.User;
import com.sxx.service.UserService;
import com.sxx.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public Result saveUser(User user) {
        return ResultUtil.successResult(userService.saveUser(user));
    }
}
