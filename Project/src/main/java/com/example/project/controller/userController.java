package com.example.project.controller;

import com.example.project.model.userModel;
import com.example.project.service.userService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class userController {
    private final userService service;
    public userController(userService service){
        this.service=service;
    }

    @PostMapping("/add")
    public userModel addRequest(@RequestBody userModel user){
        return service.addRequest(user);
    }

    @GetMapping("/user")
    public List<userModel> getResponse(){
        return service.getResponse();
    }
}
