package com.mentoria.featuretoggle.domain.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.util.Strings;

import javax.validation.constraints.AssertTrue;


@Data
@NoArgsConstructor
public class UserPatchDTO {
    private String name;
    private String password;

    @AssertTrue(message = "name or password is required")
    private boolean isNameOrPasswordSetted() {
        return !Strings.isBlank(this.name) || !Strings.isBlank(this.password);
    }
}
