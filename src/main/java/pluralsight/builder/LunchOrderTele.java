package pluralsight.builder;

public class LunchOrderTele {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    // immutable but still what if I need only first and last arguments.
    // Too many constructors with different parameters
    public LunchOrderTele (String bread) {
        this.bread = bread;
    }

    public LunchOrderTele (String bread, String condiments) {
        // telescoping because it calls constructor for another argument
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTele (String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTele (String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
