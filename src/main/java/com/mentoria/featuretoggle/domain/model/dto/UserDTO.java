package com.mentoria.featuretoggle.domain.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class UserDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String password;

}
