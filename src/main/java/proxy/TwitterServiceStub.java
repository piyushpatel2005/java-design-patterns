package proxy;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My neat timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
