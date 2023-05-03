package pluralsight.proxy;

public class Main {
    public static void main(String[] args) {
//        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
//
//        System.out.println(service.getTimeline("bh5k"));

        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("screenname"));

        service.postToTimeline("screename", "Some message");
    }
}
