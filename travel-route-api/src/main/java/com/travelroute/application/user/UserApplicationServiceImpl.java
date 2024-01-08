package com.travelroute.application.user;

import com.travelroute.domain.model.common.exception.ExceptionCode;
import com.travelroute.domain.model.user.User;
import com.travelroute.domain.model.user.UserName;
import com.travelroute.domain.model.user.exception.UserAlreadyExistException;
import com.travelroute.domain.repository.user.UserQuery;
import com.travelroute.domain.repository.user.UserReader;
import com.travelroute.domain.repository.user.UserStore;
import com.travelroute.domain.service.user.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationServiceImpl implements UserApplicationService {

    private final UserStore userStore;
    private final UserReader userReader;
    private final UserService userService;

    public UserApplicationServiceImpl(UserStore userStore, UserReader userReader, UserService userService) {
        this.userStore = userStore;
        this.userReader = userReader;
        this.userService = userService;
    }


    @Override
    public UserResult.UserData register(UserRegisterCommand command) {

        User user = new User(
            new UserName(command.name()),
            command.deviceId()
        );

        if (userService.isExists(user)) {
            throw new UserAlreadyExistException(ExceptionCode.USER_ALREADY_EXIST);
        }

        return UserResult.UserData.of(userStore.save(user));
    }

    @Override
    public Page<UserResult.UserData> findAll(UserQuery.FindAllQuery query, Pageable pageable) {
        return userReader.findAll(query, pageable)
            .map(UserResult.UserData::of);
    }
}
