package com.travelroute.infrastructure.repository.user;

import com.travelroute.domain.model.user.User;
import com.travelroute.domain.model.user.UserName;
import com.travelroute.domain.repository.user.UserQuery;
import com.travelroute.domain.repository.user.UserReader;
import com.travelroute.infrastructure.entity.user.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserReaderImpl implements UserReader {

    private final UserRepository userRepository;

    public UserReaderImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> find(Long id) {
        return userRepository.findById(id).map(UserEntity::to);
    }

    @Override
    public Optional<User> find(UserName name) {
        return userRepository.findByName(name.value())
            .map(UserEntity::to);
    }

    @Override
    public Page<User> findAll(UserQuery.FindAllQuery query, Pageable pageable) {
        return userRepository.findAll(query, pageable)
            .map(UserEntity::to);
    }
}
