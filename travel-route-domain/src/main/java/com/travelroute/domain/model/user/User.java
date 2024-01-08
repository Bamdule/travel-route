package com.travelroute.domain.model.user;

public class User {
    private Long id;
    private final UserName name;
    private final String deviceId;

    public User(UserName name, String deviceId) {
        this.name = name;
        this.deviceId = deviceId;
    }

    public User(Long id, UserName name, String deviceId) {
        this.id = id;
        this.name = name;
        this.deviceId = deviceId;
    }

    public Long getId() {
        return id;
    }

    public UserName getName() {
        return name;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
