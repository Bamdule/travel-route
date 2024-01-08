package com.travelroute.application.user;

import com.travelroute.domain.repository.user.UserQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserApplicationService {
    UserResult.UserData register(UserRegisterCommand command);

    Page<UserResult.UserData> findAll(UserQuery.FindAllQuery query, Pageable pageable);
}
