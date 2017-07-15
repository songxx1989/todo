package com.sxx.controller;

import com.sxx.entity.TodoEntity;
import com.sxx.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.Entity;
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
        List<TodoEntity> todoEntityList = todoRepository.findByQid(qid);
        model.addAttribute("todoList", todoEntityList);
        model.addAttribute("qid", qid);
        return "todo";
    }

    @GetMapping("/todo/form/{qid}")
    public String todoForm(@PathVariable("qid") int qid, Model model) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setQid(qid);
        model.addAttribute("todoEntity", todoEntity);
        return "todo-form";
    }

    @PostMapping("/todo/form")
    public String saveTodo(TodoEntity todoEntity) {
        todoEntity.setStatus(0);
        todoRepository.save(todoEntity);
        return "redirect:/todo/" + todoEntity.getQid();
    }
}
