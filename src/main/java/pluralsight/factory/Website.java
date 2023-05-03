package pluralsight.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {
    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    // This implementation is based on the concrete super classes. Shop or Blog
    public abstract void createWebsite();
}
