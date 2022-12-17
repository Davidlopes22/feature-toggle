package com.mentoria.featuretoggle.infrastructure.mappers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import com.mentoria.featuretoggle.domain.model.Functionality;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityResponseDTO;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FunctionalitiesMapper {

    public static Functionality toEntity(FunctionalityCreationDTO functionalityCreationDTO) {
        return Functionality.builder().name(functionalityCreationDTO.getName())
                .active(functionalityCreationDTO.getActive())
                .build();
    }

    public static FunctionalityResponseDTO toDTO(Functionality functionality) {
        return FunctionalityResponseDTO.builder().name(functionality.getName())
                .active(functionality.getActive())
                .id(functionality.getId())
                .createdAt(functionality.getCreatedAt())
                .updateAt(functionality.getUpdateAt())
                .build();
    }
}
