package com.mentoria.featureToggle.domain.service.impl;

import com.mentoria.featureToggle.domain.model.User;
import com.mentoria.featureToggle.domain.service.UserService;
import com.mentoria.featureToggle.infrastructure.exception.UserException;
import com.mentoria.featureToggle.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    private void newUserRepository(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {

            try{
                userRepository.save(user);

            }catch (Exception e){
                System.out.println(e.getMessage());
                throw new UserException("Username or Password invalid");
            }


    }
}
