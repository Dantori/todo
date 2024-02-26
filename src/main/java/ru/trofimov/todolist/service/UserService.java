package ru.trofimov.todolist.service;

import ru.trofimov.todolist.domain.account.User;

import java.util.List;

public interface UserService {

    boolean addUser(User user);
//    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUserById(Long id);
}
