package com.mentoria.featureToggle.domain.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="userName", nullable = false)
    @NotEmpty(message = "Name may not be empty")
    private String name;

    @Column(name="userPassword", nullable = false)
    @NotEmpty(message = "Password may not be empty")
    private String password;

    @CreatedDate
    @Column(name="created_at", nullable = false, updatable = false)
    private Date createdAt;

    @LastModifiedDate
    private Date  updateAt;

}
