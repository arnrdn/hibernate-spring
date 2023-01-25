package ru.katacademy.service;

import ru.katacademy.model.User;

import java.util.List;

public interface IService {
    List<User> listUsers();
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(User user);
}
