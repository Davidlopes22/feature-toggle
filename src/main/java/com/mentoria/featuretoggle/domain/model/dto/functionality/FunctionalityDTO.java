package com.mentoria.featuretoggle.domain.model.dto.functionality;


import lombok.Builder;

import java.util.Date;

@Builder
public class FunctionalityDTO {

    private final Long id;

    private final String name;

    private final Boolean active;

    private final Date createdAt;

    private final Date updateAt;
}
