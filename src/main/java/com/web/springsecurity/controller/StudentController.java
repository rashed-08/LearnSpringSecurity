package com.web.springsecurity.controller;

import com.web.springsecurity.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    List<User> allUsers = new ArrayList(Arrays.asList(
            new User(1, "Rashedul", "Islam"),
            new User(2, "Rafia", "Sharmin")
    ));

    @GetMapping
    public List<User> getAllUsers() {
        return allUsers;
    }
}
