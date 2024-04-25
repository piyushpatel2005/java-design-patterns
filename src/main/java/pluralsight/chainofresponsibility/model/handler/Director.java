package pluralsight.chainofresponsibility.model.handler;

import pluralsight.chainofresponsibility.model.Handler;
import pluralsight.chainofresponsibility.model.Request;
import pluralsight.chainofresponsibility.model.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Directors can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}
