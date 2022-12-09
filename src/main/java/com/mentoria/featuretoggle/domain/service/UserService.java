package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserPatchDTO;

public interface UserService {

    void save(UserCreationDTO userCreationDTO);

    UserDTO findById(Long id);

    void patch(UserPatchDTO userPatchDTO, Long id);

    void delete(Long id);
}
