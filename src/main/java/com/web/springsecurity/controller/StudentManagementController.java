package com.web.springsecurity.controller;

import com.web.springsecurity.model.User;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {
    List<User> allUsers = new ArrayList(Arrays.asList(
            new User(1,"Rashedul", "Islam"),
            new User(2,"Rafia", "Sharmin")
    ));

    @GetMapping
    public List<User> getAllUsers() {
        return allUsers;
    }

    @PostMapping
    public void registerNewUser(@RequestBody User user) {
        System.out.println(user);
    }

    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        System.out.println(userId);
    }

    @PutMapping(path = "{userId}")
    public void updateUser(@PathVariable Integer userId,@RequestBody User user) {
        System.out.println(String.format("%s %s", userId, user.toString()));
    }
}
