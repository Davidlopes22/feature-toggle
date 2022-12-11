package com.mentoria.featuretoggle.domain.model;

import com.mentoria.featuretoggle.domain.model.dto.UserPatchDTO;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Date;
import java.util.Optional;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "userName", nullable = false)
    private String name;

    @Column(name = "userPassword", nullable = false)
    private String password;

    @CreatedDate
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    private Date updateAt;

    public void updateFrom(UserPatchDTO userPatchDTO) {
        this.setName(
                Optional.ofNullable(userPatchDTO.getName())
                        .orElse(this.name));
        this.setPassword(
                Optional.ofNullable(userPatchDTO.getPassword())
                        .orElse(this.password));
        this.setUpdateAt(new Date());
    }
}
