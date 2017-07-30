package com.sxx.repository;

import com.sxx.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by songxx1989 on 2017/7/15.
 */
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findByIid(Integer qid);
}
