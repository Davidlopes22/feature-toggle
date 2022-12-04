package com.mentoria.featuretoggle.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class UserDTO {

    private Long id;

    private String name;

    private Date createdAt;

    private Date updateAt;

}
