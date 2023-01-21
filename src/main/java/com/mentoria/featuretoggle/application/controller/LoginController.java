package com.mentoria.featuretoggle.application.controller;

import com.mentoria.featuretoggle.domain.model.dto.user.UserLoginDTO;
import com.mentoria.featuretoggle.domain.service.security.TokenService;
 import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
@RequestMapping("/login")

public class LoginController {
    private final AuthenticationManager authManager;
    private final TokenService tokenService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String login(@RequestBody @Valid UserLoginDTO userLoginDTO) {
        //var token = new UsernamePasswordAuthenticationToken(userLoginDTO.getName(), userLoginDTO.getPassword());
       // Authentication authentication = authManager.authenticate(token);
        return "a";//tokenService.generateToken(authentication);
    }
}
