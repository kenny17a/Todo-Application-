package com.kenny.ToDoApp.springboottoDoApplication.config;

import com.kenny.ToDoApp.springboottoDoApplication.models.TodoItem;
import com.kenny.ToDoApp.springboottoDoApplication.repositories.TodoItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoItemDataLoader implements CommandLineRunner {
   private final Logger logger =  LoggerFactory.getLogger(TodoItemDataLoader.class);

   @Autowired
   TodoItemRepository todoItemRepository;

    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData() {
       if (todoItemRepository.count() == 0){
           TodoItem todoItem1 = new TodoItem("Reading Java all through Monday");
           TodoItem todoItem2 = new TodoItem("Reading SpringBoot on Tuesday");
           TodoItem todoItem3 = new TodoItem("Reading Python on Wednesday");
           TodoItem todoItem4 = new TodoItem("Reading React on Thursday");
           TodoItem todoItem5 = new TodoItem("Reading Django on Friday");

           todoItemRepository.save(todoItem1);
           todoItemRepository.save(todoItem2);
           todoItemRepository.save(todoItem3);
           todoItemRepository.save(todoItem4);
           todoItemRepository.save(todoItem5);

       }
       logger.info("Number of TodoItems: {}", todoItemRepository.count());
    }
}
