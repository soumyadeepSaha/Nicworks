package com.jwt.example.jwtexample4.controllers;


import com.jwt.example.jwtexample4.models.User;
import com.jwt.example.jwtexample4.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired //property/field injection - data will be injected inside theproperty
    private UserService userService;

    //http://localhost:8081/home/users     //we will try to access this url

    @GetMapping("/users")
    public List<User> getUser(){

        System.out.println("getting users");
        //so after field injection of userService above we will get the object o userservice
        return userService.getUsers(); //this shows about the instanceproperty of user you can also avoid that
    }


}
