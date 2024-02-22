package pluralsight.factory;

import pluralsight.factory.model.website.Blog;
import pluralsight.factory.model.website.Shop;
import pluralsight.factory.model.website.Website;
import pluralsight.factory.model.website.WebsiteType;

public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
