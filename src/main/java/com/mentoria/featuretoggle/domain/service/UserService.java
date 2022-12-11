package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserPatchDTO;

public interface UserService {

    void save(UserCreationDTO userCreationDTO);

    UserDTO findById(Long id);

    void patch(UserPatchDTO userPatchDTO, Long id);

    void delete(Long id);
}
