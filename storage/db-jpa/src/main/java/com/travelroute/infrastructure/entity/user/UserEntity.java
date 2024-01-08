package com.travelroute.infrastructure.entity.user;

import com.travelroute.domain.model.user.User;
import com.travelroute.domain.model.user.UserName;
import com.travelroute.infrastructure.entity.common.BaseEntity;
import jakarta.persistence.*;


@Table(name = "user")
@Entity
public class UserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "device_id", nullable = false, unique = true)
    private String deviceId;

    public UserEntity() {
    }

    public UserEntity(String name, String deviceId) {
        this.name = name;
        this.deviceId = deviceId;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public User to() {
        return new User(
            this.id,
            new UserName(this.name),
            this.deviceId
        );
    }

    public static UserEntity of(User user) {
        return new UserEntity(
            user.getName().value(),
            user.getDeviceId()
        );
    }
}
