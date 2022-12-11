package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;

public interface FunctionalityService {
    void save(FunctionalityCreationDTO functionalityCreationDTO);
}
