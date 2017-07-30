package com.sxx.controller;

import com.sxx.entity.Result;
import com.sxx.entity.Todo;
import com.sxx.repository.TodoRepository;
import com.sxx.service.TodoService;
import com.sxx.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping("/{iid}")
    public Result findByIid(@PathVariable("iid") int iid) {
        return ResultUtil.successResult(service.findByIid(iid));
    }

    @PostMapping
    public Result saveTodo(Todo todo) {
        return ResultUtil.successResult(service.saveTodo(todo));
    }
}
