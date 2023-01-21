package com.mentoria.featuretoggle.infrastructure.mappers;

import com.mentoria.featuretoggle.domain.model.dto.user.UserLoginDTO;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import com.mentoria.featuretoggle.domain.model.User;
import com.mentoria.featuretoggle.domain.model.dto.user.UserCreationDTO;
import com.mentoria.featuretoggle.domain.model.dto.user.UserResponseDTO;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UsersMapper {

    public static User toUser(UserCreationDTO userCreationDTO) {
        return User.builder()
                .name(userCreationDTO.getName())
                .password(userCreationDTO.getPassword())
                .build();
    }

    public static UserResponseDTO toDto(User user) {
        return UserResponseDTO.builder()
                .id(user.getId())
                .name(user.getName())
                .createdAt(user.getCreatedAt())
                .updateAt(user.getUpdateAt())
                .build();
    }
    public static UserLoginDTO toUserLogin(User user) {
        return UserLoginDTO.builder()
                .name(user.getName())
                .password(user.getPassword())
                .build();
    }

}
