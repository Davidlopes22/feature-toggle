package com.mentoria.featureToggle.application.controller;

import com.mentoria.featureToggle.domain.model.User;
import com.mentoria.featureToggle.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    private void newUserService(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
