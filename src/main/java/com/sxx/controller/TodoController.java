package com.sxx.controller;

import com.sxx.entity.Todo;
import com.sxx.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
@Controller
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todo/{qid}")
    public String todoList(@PathVariable("qid") int qid, Model model) {
        List<Todo> todoList = todoRepository.findByQid(qid);
        model.addAttribute("todoList", todoList);
        model.addAttribute("qid", qid);
        return "todo";
    }

    @GetMapping("/todo/form/{qid}")
    public String todoForm(@PathVariable("qid") int qid, Model model) {
        Todo todo = new Todo();
        todo.setQid(qid);
        model.addAttribute("todo", todo);
        return "todo-form";
    }

    @PostMapping("/todo/form")
    public String saveTodo(Todo todo) {
        todo.setStatus(0);
        todoRepository.save(todo);
        return "redirect:/todo/" + todo.getQid();
    }
}
