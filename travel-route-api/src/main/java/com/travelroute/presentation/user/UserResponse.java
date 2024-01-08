package com.travelroute.presentation.user;

import com.travelroute.application.user.UserResult;

public class UserResponse {

    private UserResponse() {
    }

    public record UserRegisterResponse(UserData user) {
        public static UserRegisterResponse of(UserResult.UserData userData) {
            return new UserRegisterResponse(UserData.of(userData));
        }
    }

    public record UserData(Long id, String name) {
        public static UserData of(UserResult.UserData userData) {
            return new UserData(userData.id(), userData.name());
        }
    }
}
