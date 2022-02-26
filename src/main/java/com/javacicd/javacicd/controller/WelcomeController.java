package com.javacicd.javacicd.controller;

import com.javacicd.javacicd.entity.TestTodoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/welcome")
    public TestTodoList welcome() {
        TestTodoList todoList = restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/todos",
                TestTodoList.class);
        return todoList;
    }

}
