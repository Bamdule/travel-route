package com.travelroute.domain.repository.user;

public class UserQuery {
    private UserQuery() {
    }

    public record FindAllQuery(String name) {
    }
}
