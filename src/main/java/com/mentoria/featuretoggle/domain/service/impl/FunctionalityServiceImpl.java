package com.mentoria.featuretoggle.domain.service.impl;

import com.mentoria.featuretoggle.domain.model.Functionality;

import java.util.Optional;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.mentoria.featuretoggle.domain.service.FunctionalityService;
import com.mentoria.featuretoggle.infrastructure.mappers.FunctionalitiesMapper;
import com.mentoria.featuretoggle.infrastructure.exception.FunctionalityException;
import com.mentoria.featuretoggle.infrastructure.repository.FunctionalityRepository;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityPatchDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityResponseDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;

@Service
@AllArgsConstructor
public class FunctionalityServiceImpl implements FunctionalityService {

    private final FunctionalityRepository functionalityRepository;

    public void save(FunctionalityCreationDTO functionalityCreationDTO) {
        functionalityRepository.save(
                FunctionalitiesMapper.toEntity(functionalityCreationDTO));
    }

    public FunctionalityResponseDTO findById(Long id) {
        Optional<Functionality> optionalFunctionalityFromDB = functionalityRepository.findById(id);
        return optionalFunctionalityFromDB.map(FunctionalitiesMapper::toDTO)
                .orElseThrow(() ->
                        new FunctionalityException(String.format("Functionality of id: %d not found", id)));
    }

    public void patch(Long id, FunctionalityPatchDTO functionalityPatchDTO) {
        Optional<Functionality> optionalFunctionalityFromDB = functionalityRepository.findById(id);
        Functionality functionalityFromDB = optionalFunctionalityFromDB
                .orElseThrow(() ->
                        new FunctionalityException(String.format("We couldn't patch, functionality of id: %d not found", id)));
        functionalityFromDB.updateFrom(functionalityPatchDTO);
        functionalityRepository.save(functionalityFromDB);
    }

    public void delete(Long id) {
        Optional<Functionality> optionalFunctionalityFromDB = functionalityRepository.findById(id);
        Functionality functionalityFromDB = optionalFunctionalityFromDB
                .orElseThrow(() ->
                        new FunctionalityException(String.format("We couldn't delete this functionality, id: %d not found", id)));
        functionalityRepository.delete(functionalityFromDB);
    }

}
