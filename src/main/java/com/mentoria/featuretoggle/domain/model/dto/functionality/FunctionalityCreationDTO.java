package com.mentoria.featuretoggle.domain.model.dto.functionality;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
public class FunctionalityCreationDTO {

    @NotEmpty
    private String name;

    @NotNull
    private Boolean active;
}
