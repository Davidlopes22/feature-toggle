package com.mentoria.featureToggle.domain.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
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
    private String name;

    @Column(name="userPassword", nullable = false)
    private String password;

    @CreatedDate
    @Column(name="created_at", nullable = false, updatable = false)
    private Date creationDate;

    @LastModifiedDate
    @Column(name="updateDate")
    private Date  updateDate;

}
