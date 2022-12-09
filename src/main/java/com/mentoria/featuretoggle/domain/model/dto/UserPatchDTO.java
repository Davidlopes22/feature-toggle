package com.mentoria.featuretoggle.domain.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.AssertTrue;


@Data
@NoArgsConstructor
public class UserPatchDTO {
    private String name;
    private String password;

    @AssertTrue(message = "name or password is required")
    private boolean isNameOrPasswordExists() {
        return ((this.name != null) && !this.name.isEmpty())
                ||
                ((this.password != null) && !this.password.isEmpty());
    }
}
