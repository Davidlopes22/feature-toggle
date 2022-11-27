package com.mentoria.featureToggle.infrastructure.repository;

import com.mentoria.featureToggle.domain.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Long> {

}
