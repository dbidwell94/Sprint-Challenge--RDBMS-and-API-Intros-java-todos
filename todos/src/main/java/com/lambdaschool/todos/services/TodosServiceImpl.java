package com.lambdaschool.todos.services;

import com.lambdaschool.todos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodosServiceImpl implements TodosService {

    @Autowired
    TodoRepository todoRepository;

    @Override
    public void markComplete(long todoid) {

    }
}
