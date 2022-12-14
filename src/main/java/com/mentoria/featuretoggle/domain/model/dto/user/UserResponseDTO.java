package com.mentoria.featuretoggle.domain.model.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class UserResponseDTO {

    private Long id;

    private String name;

    private Date createdAt;

    private Date updateAt;

}
