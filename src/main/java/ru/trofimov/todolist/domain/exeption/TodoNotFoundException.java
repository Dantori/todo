package ru.trofimov.todolist.domain.exeption;

import javax.persistence.EntityNotFoundException;

public class TodoNotFoundException extends EntityNotFoundException {

    public TodoNotFoundException(String message) {
        super(message);
    }
}
