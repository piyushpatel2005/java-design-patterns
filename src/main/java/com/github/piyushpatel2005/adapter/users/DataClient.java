package com.github.piyushpatel2005.adapter.users;

import com.github.piyushpatel2005.adapter.users.adapter.NewAcquisitionUserAdapter;
import com.github.piyushpatel2005.adapter.users.adapter.ThirdPartyUserAdapter;
import com.github.piyushpatel2005.adapter.users.domain.User;
import com.github.piyushpatel2005.adapter.users.domain.UserFromNewAcquisition;
import com.github.piyushpatel2005.adapter.users.domain.UserFromThirdParty;
import com.github.piyushpatel2005.adapter.users.service.ExistingUserService;
import com.github.piyushpatel2005.adapter.users.service.NewAcquisitionUserService;
import com.github.piyushpatel2005.adapter.users.service.ThirdPartyUserService;

import java.util.List;
import java.util.stream.Collectors;

public class DataClient {
    private final ExistingUserService existingUserService;
    private final NewAcquisitionUserService newAcquisitionUserService;
    private final ThirdPartyUserService thirdPartyUserService;

    public DataClient(ExistingUserService exitingUserService, NewAcquisitionUserService newAcquisitionUserService, ThirdPartyUserService thirdPartyUserService) {
        this.existingUserService = exitingUserService;
        this.newAcquisitionUserService = newAcquisitionUserService;
        this.thirdPartyUserService = thirdPartyUserService;
    }

    public List<User> getAllUsers() {
        List<User> users = existingUserService.getAllUsers();

        // to get users from third party, we need ThirdParty to ExistingUser adapter
        List<UserFromThirdParty> thirdPartyUsers = thirdPartyUserService.getAllUsers();
//        users.add(thirdPartyUsers.get(0)); // This does not work, we need to convert UserFromThirdParty to User
        List<User> usersFromThirdParty = thirdPartyUsers.stream()
                .map(ThirdPartyUserAdapter::new)
                .collect(Collectors.toList());
        users.addAll(usersFromThirdParty);

        // to get users from new acquisition, we need NewAcquisition to ExistingUser adapter
        List<UserFromNewAcquisition> newAcquisitionUsers = newAcquisitionUserService.getAllUsers();
        List<User> usersFromNewAcquisition = newAcquisitionUsers.stream()
                .map(NewAcquisitionUserAdapter::new)
                .collect(Collectors.toList());
        users.addAll(usersFromNewAcquisition);

        return users;
    }
}
