package pluralsight.flyweight;

import java.util.HashMap;
import java.util.Map;

// acts as a pluralsight.factory and cache for Item pluralsight.flyweight objects
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    // Create item if not available else return existing one
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName))
            items.put(itemName, new Item(itemName));
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
