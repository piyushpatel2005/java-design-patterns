package pluralsight.factory.model.website;

import pluralsight.factory.model.page.CommentPage;
import pluralsight.factory.model.page.ContactPage;
import pluralsight.factory.model.page.PostPage;
import pluralsight.factory.model.page.AboutPage;

public class Blog extends Website {
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
