package pluralsight.factory.model.website;

import pluralsight.factory.model.page.CartPage;
import pluralsight.factory.model.page.ItemPage;
import pluralsight.factory.model.page.SearchPage;
import pluralsight.factory.model.website.Website;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
