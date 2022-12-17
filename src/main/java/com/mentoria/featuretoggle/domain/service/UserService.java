package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.user.UserPatchDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserResponseDTO;

public interface UserService {

    void save(UserCreationDTO userCreationDTO);

    UserResponseDTO findById(Long id);

    void patch(UserPatchDTO userPatchDTO, Long id);

    void delete(Long id);
}
