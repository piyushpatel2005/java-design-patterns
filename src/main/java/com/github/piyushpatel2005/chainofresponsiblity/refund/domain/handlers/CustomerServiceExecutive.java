package com.github.piyushpatel2005.chainofresponsiblity.refund.domain.handlers;


import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Handler;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Request;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.RequestType;

public class CustomerServiceExecutive extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(
                (request.getRequestType() == RequestType.CANCELLATION && request.getAmount() <= 1000) ||
                (request.getRequestType() == RequestType.REFUND && request.getAmount() <= 500)
        ) {
            System.out.printf("Customer service executive has approved this request for amount $%.2f.\n", request.getAmount());
        } else {
            System.out.println("Customer service executive has escalated this request to supervisor.");
            successor.handleRequest(request);
        }
    }
}
