package com.mentoria.featuretoggle.infrastructure.mappers;

import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.model.dto.UserDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor(access= AccessLevel.PRIVATE)
public class UsersMapper {

    public static User toEntity(UserDTO userDTO) {
        Date now = new Date();
        return User.builder()
                .name(userDTO.getName())
                .password(userDTO.getPassword())
                .createdAt(now)
                .updateAt(now)
                .build();
    }
}
