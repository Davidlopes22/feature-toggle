package com.mentoria.featuretoggle.domain.service;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityPatchDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityResponseDTO;

public interface FunctionalityService {
    void save(FunctionalityCreationDTO functionalityCreationDTO);

    FunctionalityResponseDTO findById(Long id);

    void patch(Long id, FunctionalityPatchDTO functionalityPatchDTO);

    void delete(Long id);
}
