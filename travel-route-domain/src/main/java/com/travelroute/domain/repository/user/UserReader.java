package com.travelroute.domain.repository.user;

import com.travelroute.domain.model.user.User;
import com.travelroute.domain.model.user.UserName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface UserReader {
    Optional<User> find(Long id);

    Optional<User> find(UserName name);

    Page<User> findAll(UserQuery.FindAllQuery query, Pageable pageable);
}
