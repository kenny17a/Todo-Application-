package com.kenny.ToDoApp.springboottoDoApplication.repositories;

import com.kenny.ToDoApp.springboottoDoApplication.models.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
