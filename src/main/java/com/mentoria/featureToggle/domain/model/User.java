package com.mentoria.featureToggle.domain.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="USER_NAME", nullable = false)
    private String name;

    @Column(name="USER_PASSWORD", nullable = false)
    private String password;

    @CreatedDate
    @Column(name="DT_CREATION", nullable = false)
    private LocalDateTime dt_creation;

    @LastModifiedDate
    @Column(name="DT_UPDATE")
    private LocalDateTime dt_update;

}
