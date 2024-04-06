package com.github.piyushpatel2005.adapter.users;

import com.github.piyushpatel2005.adapter.users.service.ExistingUserService;
import com.github.piyushpatel2005.adapter.users.service.NewAcquisitionUserService;
import com.github.piyushpatel2005.adapter.users.service.ThirdPartyUserService;

public class Main {
    public static void main(String[] args) {
        ExistingUserService existingUserRepository = new ExistingUserService();
        ThirdPartyUserService thirdPartyUserRepository = new ThirdPartyUserService();
        NewAcquisitionUserService newAcquisitionUserRepository = new NewAcquisitionUserService();

        DataClient dataClient = new DataClient(existingUserRepository, newAcquisitionUserRepository, thirdPartyUserRepository);
        dataClient.getAllUsers().forEach(System.out::println);
    }
}
