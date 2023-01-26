package ru.katacademy.dao;

import ru.katacademy.model.User;

import java.util.List;

public interface IDAO {
    List<User> listUsers();

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findById(Long id);
}
