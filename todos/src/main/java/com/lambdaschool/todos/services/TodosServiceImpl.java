package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todo;
import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class TodosServiceImpl implements TodosService {

    @Autowired
    TodoRepository todoRepository;

    @Override
    public void markComplete(long todoid) {
        Todo todo = todoRepository.findById(todoid)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Todo with id %d not found", todoid)));
        todo.setCompleted(true);
        todoRepository.save(todo);
    }
}
