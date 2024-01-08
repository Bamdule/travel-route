package com.travelroute.infrastructure.repository.user;

import com.travelroute.infrastructure.entity.user.UserEntity;
import com.travelroute.domain.repository.user.UserQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserQueryDslRepository {
    Page<UserEntity> findAll(UserQuery.FindAllQuery query, Pageable pageable);
}
