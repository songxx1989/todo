package com.sxx.service;

import com.sxx.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findByIid(Integer iid);

    Todo saveTodo(Todo todo);
}
