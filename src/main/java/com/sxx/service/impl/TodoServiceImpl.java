package com.sxx.service.impl;

import com.sxx.entity.Todo;
import com.sxx.repository.TodoRepository;
import com.sxx.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository repository;

    @Override
    public List<Todo> findByIid(Integer iid) {
        return repository.findByIid(iid);
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return repository.save(todo);
    }
}
