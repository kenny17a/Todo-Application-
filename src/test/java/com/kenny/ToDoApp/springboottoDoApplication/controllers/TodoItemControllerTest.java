package com.kenny.ToDoApp.springboottoDoApplication.controllers;

import com.kenny.ToDoApp.springboottoDoApplication.models.TodoItem;
import com.kenny.ToDoApp.springboottoDoApplication.repositories.TodoItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemControllerTest {
    @Autowired
    private TodoItemController todoItemController;
    @Autowired
    private TodoItemRepository todoItemRepository;
    @Autowired
    private TodoItem todoItem;


    @BeforeEach
    void setUp() {
        todoItem = new TodoItem();
        todoItem.setDescription("The new todo App");
        todoItem.setComplete(false);
    }
    @Test
    void testThatTodoItemCanBeCreated(){

    }
}