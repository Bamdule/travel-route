package com.travelroute.infrastructure.repository.user;

import com.travelroute.infrastructure.entity.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long>, UserQueryDslRepository {
    Optional<UserEntity> findByName(String name);
}
