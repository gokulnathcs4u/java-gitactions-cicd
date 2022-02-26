package com.javacicd.javacicd.entity;

import java.util.ArrayList;
import java.util.List;

public class TestTodoList {
    List<TestTodo> todoList;

    public TestTodoList() {
        super();
        todoList = new ArrayList<>();
    }

    public List<TestTodo> getTodoList() {
        return this.todoList;
    }

    public void setTodoList(List<TestTodo> todoList) {
        this.todoList = todoList;
    }

}
