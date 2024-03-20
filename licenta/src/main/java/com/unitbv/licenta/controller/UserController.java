package com.unitbv.licenta.controller;

import com.unitbv.licenta.model.User;
import com.unitbv.licenta.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @GetMapping("getUsers")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @PostMapping("postUsers")
    public ResponseEntity<HttpStatus> postUsers(){
        User user = new User(1,"Kshirsagar","Jay", "1234","ADMIN","jay.kshirsagar@student.unitbv.ro");
        this.userRepository.save(user);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
