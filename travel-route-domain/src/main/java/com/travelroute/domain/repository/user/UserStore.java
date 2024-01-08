package com.travelroute.domain.repository.user;


import com.travelroute.domain.model.user.User;

public interface UserStore {
    User save(User User);
}
