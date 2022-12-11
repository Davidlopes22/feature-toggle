package com.mentoria.featuretoggle.domain.service.impl;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.service.FunctionalityService;
import com.mentoria.featuretoggle.infrastructure.mappers.FunctionalitiesMapper;
import com.mentoria.featuretoggle.infrastructure.repository.FunctionalityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FunctionalityServiceImpl implements FunctionalityService {

    private final FunctionalityRepository functionalityRepository;

    public void save(FunctionalityCreationDTO functionalityCreationDTO) {
        functionalityRepository.save(
                FunctionalitiesMapper.toEntity(functionalityCreationDTO));
    }

}
