package com.johanna.userservice.repository;

import com.johanna.userservice.domain.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {
}
