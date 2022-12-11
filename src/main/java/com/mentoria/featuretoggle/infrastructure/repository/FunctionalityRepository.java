package com.mentoria.featuretoggle.infrastructure.repository;

import com.mentoria.featuretoggle.domain.model.Functionality;
import org.springframework.data.repository.CrudRepository;

public interface FunctionalityRepository extends CrudRepository<Functionality, Long> {
}
