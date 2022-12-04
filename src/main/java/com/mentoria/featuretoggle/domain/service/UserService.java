package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserDTO;

public interface UserService {

    void save(UserCreationDTO userCreationDTO);

    UserDTO findById(Long id);

}
