package com.javacicd.javacicd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.javacicd.javacicd.entity.TestTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

    @Autowired
    RestTemplate restTemplate;

    List<TestTodo> testTodos = new ArrayList<>();

    @GetMapping("/todos")
    public List<TestTodo> getAllTodos() {
        ResponseEntity<List<TestTodo>> todoList = restTemplate.exchange(
                "https://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET, null,
                new ParameterizedTypeReference<List<TestTodo>>() {
                });
        testTodos = todoList.getBody();
        return testTodos;
    }

    @GetMapping("/todos/user/{userId}")
    public List<TestTodo> getAllTodosByUserId(@PathVariable("userId") Integer userId) {
        if (CollectionUtils.isEmpty(testTodos)) {
            testTodos = getAllTodos();
        }
        return testTodos.stream().filter(todo -> todo.getUserId().intValue() == userId.intValue())
                .collect(Collectors.toList());
    }

    @GetMapping("/todos/{id}")
    public List<TestTodo> getAllTodosById(@PathVariable("id") Integer id) {
        if (CollectionUtils.isEmpty(testTodos)) {
            testTodos = getAllTodos();
        }
        return testTodos.stream().filter(todo -> todo.getId().intValue() == id.intValue())
                .collect(Collectors.toList());
    }

}
