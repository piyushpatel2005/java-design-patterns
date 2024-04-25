package com.github.piyushpatel2005.chainofresponsiblity.refund;

import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Request;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.RequestType;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.handlers.CustomerServiceExecutive;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.handlers.Manager;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.handlers.Supervisor;

public class Main {

    public static void main(String[] args) {
        CustomerServiceExecutive customerServiceExecutive = new CustomerServiceExecutive();
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();

        customerServiceExecutive.nextHandler(supervisor);
        supervisor.nextHandler(manager);

        customerServiceExecutive.handleRequest(new Request(RequestType.CANCELLATION, 1000));
        customerServiceExecutive.handleRequest(new Request(RequestType.CANCELLATION, 5001));
    }

}
