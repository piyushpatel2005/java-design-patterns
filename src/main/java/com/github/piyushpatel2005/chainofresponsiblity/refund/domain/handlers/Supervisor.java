package com.github.piyushpatel2005.chainofresponsiblity.refund.domain.handlers;

import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Handler;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Request;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.RequestType;

public class Supervisor extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(
                (request.getRequestType() == RequestType.CANCELLATION && request.getAmount() <= 5000) ||
                        (request.getRequestType() == RequestType.REFUND && request.getAmount() <= 2000)
        ) {
            System.out.printf("Supervisor executive has approved this request for amount $%.2f.\n", request.getAmount());
        } else {
            System.out.println("Supervisor has escalated this request to manager.");
            successor.handleRequest(request);
        }
    }
}
