package io.daio.mvp.services;

import io.daio.mvp.models.User;

public final class UserService implements MVPService<User> {

    @Override
    public User get() {
        return new User("Billy", 20);
    }

}
