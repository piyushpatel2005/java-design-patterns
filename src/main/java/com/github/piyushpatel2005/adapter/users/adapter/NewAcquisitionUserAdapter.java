package com.github.piyushpatel2005.adapter.users.adapter;

import com.github.piyushpatel2005.adapter.users.domain.User;
import com.github.piyushpatel2005.adapter.users.domain.UserFromNewAcquisition;

public class NewAcquisitionUserAdapter implements User {
    private final UserFromNewAcquisition userFromNewAcquisition;

    public NewAcquisitionUserAdapter(UserFromNewAcquisition userFromNewAcquisition) {
        this.userFromNewAcquisition = userFromNewAcquisition;
    }

    @Override
    public int getId() {
        return userFromNewAcquisition.getUserId();
    }

    @Override
    public String getFirstName() {
        return userFromNewAcquisition.getGivenName();
    }

    @Override
    public String getLastName() {
        return userFromNewAcquisition.getLastName();
    }

    @Override
    public String getEmail() {
        return userFromNewAcquisition.getEmail();
    }

    @Override
    public String toString() {
        return "NewAcquisitionUserAdapter{" +
                "userFromNewAcquisition=" + userFromNewAcquisition +
                '}';
    }
}
