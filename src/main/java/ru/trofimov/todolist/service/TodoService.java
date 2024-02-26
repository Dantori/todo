package ru.trofimov.todolist.service;

import ru.trofimov.todolist.domain.todo.Todo;

import java.util.List;

public interface TodoService {

    void addTodo(Todo todo);
    Todo getById(Long id);
    List<Todo> getAllByUserId(Long userId);
    void deleteTodoById(Long id);
}
