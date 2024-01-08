package com.travelroute.application.user;

import com.travelroute.domain.model.user.User;

public class UserResult {
    private UserResult() {
    }

    public record UserData(Long id, String name) {
        public static UserData of(User user) {
            return new UserData(
                user.getId(),
                user.getName().value()
            );
        }
    }
}
