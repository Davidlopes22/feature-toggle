package com.mentoria.featuretoggle.infrastructure.repository;

import org.springframework.data.repository.CrudRepository;
import com.mentoria.featuretoggle.domain.model.Functionality;

public interface FunctionalityRepository extends CrudRepository<Functionality, Long> {
}
