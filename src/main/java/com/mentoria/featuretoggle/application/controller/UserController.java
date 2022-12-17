package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserResponseDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserPatchDTO;
import com.mentoria.featuretoggle.domain.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public UserResponseDTO findUser(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void patchUser(@PathVariable("id") Long id, @RequestBody @Valid UserPatchDTO userCreationDTO) {
        userService.patch(userCreationDTO, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
    }

}
