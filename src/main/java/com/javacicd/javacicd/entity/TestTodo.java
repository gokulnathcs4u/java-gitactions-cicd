package com.javacicd.javacicd.entity;

public class TestTodo {
    public Integer userId;
    public Integer id;
    public String title;
    public String completed;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompleted() {
        return this.completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

}
