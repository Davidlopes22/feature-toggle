package com.mentoria.featuretoggle.domain.service.impl;

import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.model.dto.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserPatchDTO;
import com.mentoria.featuretoggle.domain.service.UserService;
import com.mentoria.featuretoggle.infrastructure.exception.UserException;
import com.mentoria.featuretoggle.infrastructure.mappers.UsersMapper;
import com.mentoria.featuretoggle.infrastructure.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.Date;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public void save(UserCreationDTO userCreationDTO) {

        userRepository.save(UsersMapper.toEntity(userCreationDTO));
    }

    public UserDTO findById(Long id) {
        Optional<User> auxUserOptional = userRepository.findById(id);
        return auxUserOptional
                .map(UsersMapper::toDto)
                .orElseThrow(() ->
                        new UserException(String.format("user of id: %d not found", id)));
    }

    public void patch(UserPatchDTO userPatchDTO, Long id) {
        Optional<User> auxUserOptional = userRepository.findById(id);
        User auxUser = auxUserOptional.stream().findFirst().orElseThrow(() ->
                new UserException(String.format("impossible patch user of id: %d, we couldn't found", id)));
        auxUser.setName(
                Optional.ofNullable(userPatchDTO.getName())
                        .orElse(auxUser.getName()));
        auxUser.setPassword(
                Optional.ofNullable(userPatchDTO.getPassword())
                        .orElse(auxUser.getPassword()));
        auxUser.setUpdateAt(new Date());

        userRepository.save(auxUser);
    }

}
