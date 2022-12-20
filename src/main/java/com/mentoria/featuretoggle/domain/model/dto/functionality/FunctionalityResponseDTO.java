package com.mentoria.featuretoggle.domain.model.dto.functionality;


import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class FunctionalityResponseDTO {

    private final Long id;

    private final String name;

    private final Boolean active;

    private final Date createdAt;

    private final Date updateAt;
}
