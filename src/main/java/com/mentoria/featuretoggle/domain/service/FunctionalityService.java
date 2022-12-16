package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityDTO;

public interface FunctionalityService {
    void save(FunctionalityCreationDTO functionalityCreationDTO);

    FunctionalityDTO findById(Long id);
}
