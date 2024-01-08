package com.travelroute.presentation.user;

import com.travelroute.application.user.UserRegisterCommand;

public class UserRequest {
    private UserRequest() {
    }

    public record UserRegisterRequest(String name, String deviceId) {
        public UserRegisterCommand to() {
            return new UserRegisterCommand(this.name, this.deviceId);
        }
    }
}
