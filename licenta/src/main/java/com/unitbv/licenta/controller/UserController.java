package com.unitbv.licenta.controller;

import com.unitbv.licenta.model.User;
import com.unitbv.licenta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserRepository userRepository;
    User userLogged;
    @GetMapping("getUsers")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("postUsers")
    public User postUsers(@RequestBody User user){
        return this.userRepository.save(user);
    }

    @CrossOrigin
    @PostMapping("userLogged")
    public void setUserLogged(@RequestBody User user){
        userLogged = user;
    }
    @CrossOrigin
    @GetMapping("getUserLogged")
    public User getUserLogged()
    {
        return userLogged;
    }
    @CrossOrigin
    @GetMapping("setUserLogout")
    public void setUserLogout(){
        userLogged = null;
    }
}
