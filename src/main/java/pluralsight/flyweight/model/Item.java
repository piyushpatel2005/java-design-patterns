package pluralsight.flyweight.model;

// This will be the Flyweights
// We need to create many instances of this class
class Item {

    // it's immutable, no setters
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
