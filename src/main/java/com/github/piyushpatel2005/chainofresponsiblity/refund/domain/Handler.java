package com.github.piyushpatel2005.chainofresponsiblity.refund.domain;

public abstract class Handler {

    protected Handler successor;

    public void nextHandler(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}