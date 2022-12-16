package com.mentoria.featuretoggle.infrastructure.mappers;

import com.mentoria.featuretoggle.domain.model.Functionality;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FunctionalitiesMapper {

    public static Functionality toEntity(FunctionalityCreationDTO functionalityCreationDTO){
        return Functionality.builder().name(functionalityCreationDTO.getName())
                .active(functionalityCreationDTO.getActive())
                .build();
    }
    public static FunctionalityDTO toDTO(Functionality functionality){
        return FunctionalityDTO.builder().name(functionality.getName())
                .active(functionality.getActive())
                .id(functionality.getId())
                .createdAt(functionality.getCreatedAt())
                .updateAt(functionality.getUpdateAt())
                .build();
    }
}
