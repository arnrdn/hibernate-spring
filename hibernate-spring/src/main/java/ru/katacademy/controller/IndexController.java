package ru.katacademy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.katacademy.service.UserServiceImpl;
import ru.katacademy.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    private final UserServiceImpl userService;

    @Autowired
    public IndexController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String index(ModelMap model) {
        List<User> usr = userService.listUsers();
        System.out.println("CONTROLLER" + Arrays.toString(usr.toArray()));

        model.addAttribute("users", userService.listUsers());
        return "index";
    }

}