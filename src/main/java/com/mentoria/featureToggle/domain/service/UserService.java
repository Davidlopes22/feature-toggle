package com.mentoria.featureToggle.domain.service;

import com.mentoria.featureToggle.domain.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService{
    void saveUser(User user);
}
