package com.mentoria.featuretoggle.domain.model.dto.functionality;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

import javax.validation.constraints.AssertTrue;

@Data
public class FunctionalityPatchDTO {

    private final String name;

    private final Boolean active;

    @AssertTrue(message = "name or active is required")
    private boolean isNameOrActiveSetted() {
        return !Strings.isBlank(this.name) || (this.active != null);
    }
}
