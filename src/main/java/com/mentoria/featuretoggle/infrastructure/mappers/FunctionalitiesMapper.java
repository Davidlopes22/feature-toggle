package com.mentoria.featuretoggle.infrastructure.mappers;

import com.mentoria.featuretoggle.domain.model.Functionality;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FunctionalitiesMapper {

    public static Functionality toEntity(FunctionalityCreationDTO functionalityCreationDTO){
        return Functionality.builder().name(functionalityCreationDTO.getName())
                .active(functionalityCreationDTO.getActive())
                .build();
    }
}
