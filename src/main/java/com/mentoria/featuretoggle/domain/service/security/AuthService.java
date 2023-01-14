package com.mentoria.featuretoggle.domain.service.security;

import com.mentoria.featuretoggle.infrastructure.mappers.UsersMapper;
import com.mentoria.featuretoggle.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) {
        return UsersMapper.toUserLogin(userRepository.findByName(name));

    }
}