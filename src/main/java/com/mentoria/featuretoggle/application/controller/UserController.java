package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.domain.model.dto.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserDTO;
import com.mentoria.featuretoggle.domain.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody @Valid UserCreationDTO userCreationDTO) {
        userService.save(userCreationDTO);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO findUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

}
