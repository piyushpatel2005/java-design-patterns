package com.github.piyushpatel2005.adapter.users.service;

import com.github.piyushpatel2005.adapter.users.domain.UserFromNewAcquisition;

import java.util.List;

public class NewAcquisitionUserService {
    public List<UserFromNewAcquisition> getAllUsers() {
        UserFromNewAcquisition user1 = new UserFromNewAcquisition(1, "Jessica", "Livingstone", "jessica@example.com");
        UserFromNewAcquisition user2 = new UserFromNewAcquisition(2, "Ron", "Goyette", "rontoday@gmail.com");
        List<UserFromNewAcquisition> newUsers = List.of(user1, user2);
        return newUsers;

    }
}
