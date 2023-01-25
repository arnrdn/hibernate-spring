package ru.katacademy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.katacademy.dao.UserDAOImpl;
import ru.katacademy.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements IService{

    @Autowired
    private UserDAOImpl userDAO;

    @Override
    public List<User> listUsers() {
        return userDAO.listUsers();
    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }
}
