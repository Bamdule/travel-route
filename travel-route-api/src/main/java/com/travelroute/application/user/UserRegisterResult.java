package com.travelroute.application.user;

import com.travelroute.domain.model.user.User;

public record UserRegisterResult(Long id, String name) {
    public static UserRegisterResult of(User user) {
        return new UserRegisterResult(
            user.getId(),
            user.getName().value()
        );
    }
}
