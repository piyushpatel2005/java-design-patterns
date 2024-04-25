package com.github.piyushpatel2005.chainofresponsiblity.refund.domain.handlers;

import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Handler;
import com.github.piyushpatel2005.chainofresponsiblity.refund.domain.Request;

public class Manager extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() <= 10000) {
            System.out.println("Manager has approved this request.");
        } else {
            System.out.println("Manager can only provide credits upto 10000. Please file a complaint and billing department will get back to you.");
        }
    }
}
