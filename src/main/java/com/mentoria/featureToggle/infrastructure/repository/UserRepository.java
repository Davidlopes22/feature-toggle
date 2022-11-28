package com.mentoria.featureToggle.infrastructure.repository;

import com.mentoria.featureToggle.domain.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
