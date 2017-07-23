package com.sxx.controller;

import com.sxx.entity.Result;
import com.sxx.entity.User;
import com.sxx.service.UserService;
import com.sxx.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public Result saveUser(@Valid User user, Errors errors) {
        if (errors.hasErrors()) {
            return ResultUtil.errorResult("表单校验失败");
        }
        return ResultUtil.successResult(userService.saveUser(user));
    }

    @GetMapping("/user")
    public Result findAll() {
        return ResultUtil.successResult(userService.findAll());
    }

    @DeleteMapping("/user/{id}")
    public Result delUser(@PathVariable int id) {
        userService.delUser(id);
        return ResultUtil.successResult();
    }
}
