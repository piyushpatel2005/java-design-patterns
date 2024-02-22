package pluralsight.factory;

import pluralsight.factory.model.website.Website;
import pluralsight.factory.model.website.WebsiteType;

public class Main {
    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
