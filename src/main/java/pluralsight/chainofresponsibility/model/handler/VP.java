package pluralsight.chainofresponsibility.model.handler;

import pluralsight.chainofresponsibility.model.Handler;
import pluralsight.chainofresponsibility.model.Request;
import pluralsight.chainofresponsibility.model.RequestType;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() < 1500) {
                System.out.println("VPs can approve purchases below 1500");
            } else {
                successor.handleRequest(request);
            }
        }
    }
}
