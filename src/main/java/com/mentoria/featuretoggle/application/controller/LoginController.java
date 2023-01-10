package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserLoginDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@AllArgsConstructor
@RequestMapping("/login")

public class LoginController {
    private final AuthenticationManager authManager;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void login(@RequestBody @Valid UserLoginDTO userLoginDTO){
        var token = new UsernamePasswordAuthenticationToken(userLoginDTO.getName(),userLoginDTO.getPassword());
        var authentication = authManager.authenticate(token);
        System.out.println(authentication);
    }
}
