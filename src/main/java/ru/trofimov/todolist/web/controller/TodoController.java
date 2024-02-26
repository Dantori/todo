package ru.trofimov.todolist.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.trofimov.todolist.domain.account.User;
import ru.trofimov.todolist.domain.todo.Todo;
import ru.trofimov.todolist.service.TodoService;

@Controller()
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String todo(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("allTodos", todoService.getAllByUserId(user.getId()));
        model.addAttribute("newTodo", new Todo());
        return "todo";
    }

    @PostMapping("/add")
    public String addTodo(@AuthenticationPrincipal User user, @ModelAttribute Todo newTodo) {
        newTodo.setUser(user);
        todoService.addTodo(newTodo);
        return "redirect:/todos";
    }

    @PostMapping("/update/{id}")
    public String updateTodoStatus(@PathVariable Long id) {
        Todo todo = todoService.getById(id);
        todo.setCompleted(!todo.isCompleted());
        todoService.addTodo(todo);
        return "redirect:/todos";
    }


    @PostMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoService.deleteTodoById(id);
        return "redirect:/todos";
    }
}
