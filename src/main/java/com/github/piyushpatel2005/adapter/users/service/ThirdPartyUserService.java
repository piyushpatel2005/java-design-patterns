package com.github.piyushpatel2005.adapter.users.service;

import com.github.piyushpatel2005.adapter.users.domain.UserFromThirdParty;

import java.util.List;

public class ThirdPartyUserService {
    public List<UserFromThirdParty> getAllUsers() {
        UserFromThirdParty user1 = new UserFromThirdParty(1, "Rocky Balboa" , "rocky.rocks@gmail.com");
        UserFromThirdParty user2 = new UserFromThirdParty(2, "John Rambo", "rambo@example.com");
        List<UserFromThirdParty> users = List.of(user1, user2);
        return users;
    }
}
