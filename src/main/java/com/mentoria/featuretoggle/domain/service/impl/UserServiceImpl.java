package com.mentoria.featuretoggle.domain.service.impl;

import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.service.UserService;
import com.mentoria.featuretoggle.infrastructure.mappers.UsersMapper;
import com.mentoria.featuretoggle.domain.model.dto.user.UserPatchDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserResponseDTO;
import com.mentoria.featuretoggle.infrastructure.exception.UserException;
import com.mentoria.featuretoggle.infrastructure.repository.UserRepository;


import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public void save(UserCreationDTO userCreationDTO) {

        userRepository.save(UsersMapper.toEntity(userCreationDTO));
    }

    public UserResponseDTO findById(Long id) {
        Optional<User> auxUserOptional = userRepository.findById(id);
        return auxUserOptional
                .map(UsersMapper::toDto)
                .orElseThrow(() ->
                        new UserException(String.format("user of id: %d not found", id)));
    }

    public void patch(UserPatchDTO userPatchDTO, Long id) {
        Optional<User> optionalDatabaseUser = userRepository.findById(id);
        User databaseUser = optionalDatabaseUser
                .orElseThrow(() ->
                        new UserException(String.format("impossible patch user of id: %d, we couldn't found", id)));
        databaseUser.updateFrom(userPatchDTO);
        userRepository.save(databaseUser);
    }

    public void delete(Long id) {
        Optional<User> optionalDatabaseUser = userRepository.findById(id);
        User databaseUser = optionalDatabaseUser
                .orElseThrow(() ->
                        new UserException(String.format("impossible delete user of id: %d, we couldn't found", id)));
        userRepository.delete(databaseUser);
    }

}
