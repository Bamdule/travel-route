package com.travelroute.infrastructure.repository.user;

import com.travelroute.domain.model.user.User;
import com.travelroute.domain.repository.user.UserStore;
import com.travelroute.infrastructure.entity.user.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserStoreImpl implements UserStore {

    private final UserRepository userRepository;

    public UserStoreImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(UserEntity.of(user))
            .to();
    }
}
