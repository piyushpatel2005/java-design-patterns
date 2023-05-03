package pluralsight.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        Request request = new Request(RequestType.CONFERENCE, 500);
        director.handleRequest(request);

        // Client doesn't need to know who is handling their request
        // The code itself will assign it to respective successor
        request = new Request(RequestType.PURCHASE, 1000);
        director.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        director.handleRequest(request);
    }
}
