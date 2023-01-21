package com.mentoria.featuretoggle.infrastructure.repository;

import com.mentoria.featuretoggle.domain.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByName(String name);

}
