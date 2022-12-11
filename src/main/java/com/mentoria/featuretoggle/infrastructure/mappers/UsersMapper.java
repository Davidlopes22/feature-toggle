package com.mentoria.featuretoggle.infrastructure.mappers;

import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UsersMapper {

    public static User toEntity(UserCreationDTO userCreationDTO) {
        return User.builder()
                .name(userCreationDTO.getName())
                .password(userCreationDTO.getPassword())
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
