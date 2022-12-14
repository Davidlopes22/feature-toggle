package com.mentoria.featuretoggle.domain.model.dto.user;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class UserCreationDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String password;

}
