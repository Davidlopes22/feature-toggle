package com.mentoria.featuretoggle.infrastructure.mappers;

import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.model.dto.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.UserDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UsersMapper {

    public static User toEntity(UserCreationDTO userCreationDTO) {
        Date now = new Date();
        return User.builder()
                .name(userCreationDTO.getName())
                .password(userCreationDTO.getPassword())
                .createdAt(now)
                .updateAt(now)
                .build();
    }

    public static UserDTO toDto(User user) {
        return UserDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .createdAt(user.getCreatedAt())
                .updateAt(user.getUpdateAt())
                .build();
    }
}
