package com.github.piyushpatel2005.adapter.users.service;

import com.github.piyushpatel2005.adapter.users.domain.ExistingUser;
import com.github.piyushpatel2005.adapter.users.domain.User;

import java.util.ArrayList;
import java.util.List;

public class ExistingUserService {

    public final List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new ExistingUser(1, "John", "Doe", "john.doe@gmail.com");
        User user2 = new ExistingUser(2, "Jane", "Doe", "jane.doe@hotmail.com");
        User user3 = new ExistingUser(3, "Alice", "Smith", "andrew@yahoo.com");
        users.addAll(List.of(user1, user2, user3));
        return users;
    }
}
