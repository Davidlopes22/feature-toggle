package com.mentoria.featuretoggle.domain.model;

import com.mentoria.featuretoggle.domain.model.dto.functionality.FunctionalityPatchDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Optional;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "functionalities")
@EntityListeners(AuditingEntityListener.class)
public class Functionality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String name;

    @NotNull
    private Boolean active;

    @NotNull
    @CreatedDate
    @Column(updatable = false)
    private Date createdAt;

    @LastModifiedDate
    private Date updateAt;

    public void updateFrom(FunctionalityPatchDTO functionalityPatchDTO) {
        this.setName(Optional.ofNullable(functionalityPatchDTO.getName())
                .orElse(this.name));
        this.setActive(Optional.ofNullable(functionalityPatchDTO.getActive()).
                orElse(this.active));
    }
}
