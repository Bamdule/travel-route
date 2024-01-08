package com.travelroute.domain.service.user;

import com.travelroute.domain.model.user.User;
import com.travelroute.domain.repository.user.UserReader;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserReader userReader;

    public UserServiceImpl(UserReader userReader) {
        this.userReader = userReader;
    }

    @Override
    public boolean isExists(User User) {
        return userReader.find(User.getName())
            .isPresent();
    }
}
