package com.github.piyushpatel2005.adapter.users.adapter;

import com.github.piyushpatel2005.adapter.users.domain.User;
import com.github.piyushpatel2005.adapter.users.domain.UserFromThirdParty;

public class ThirdPartyUserAdapter implements User {
    private final UserFromThirdParty userFromThirdParty;

    public ThirdPartyUserAdapter(UserFromThirdParty userFromThirdParty) {
        this.userFromThirdParty = userFromThirdParty;
    }

    @Override
    public int getId() {
        return userFromThirdParty.getId();
    }

    @Override
    public String getFirstName() {
        return userFromThirdParty.getName().split(" ")[0];
    }

    @Override
    public String getLastName() {
        return userFromThirdParty.getName().split(" ")[1];
    }

    @Override
    public String getEmail() {
        return userFromThirdParty.getEmailAddress();
    }

    @Override
    public String toString() {
        return "ThirdPartyUserAdapter{" +
                "userFromThirdParty=" + userFromThirdParty +
                '}';
    }
}
