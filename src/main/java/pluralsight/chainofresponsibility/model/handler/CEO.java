package pluralsight.chainofresponsibility.model.handler;

import pluralsight.chainofresponsibility.model.Handler;
import pluralsight.chainofresponsibility.model.Request;

public class CEO extends Handler {
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEOs can approve anything they want");
    }
}
