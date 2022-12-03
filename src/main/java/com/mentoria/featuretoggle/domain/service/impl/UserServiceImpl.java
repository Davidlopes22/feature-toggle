package com.mentoria.featuretoggle.domain.service.impl;

import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.service.UserService;
import com.mentoria.featuretoggle.infrastructure.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

}
