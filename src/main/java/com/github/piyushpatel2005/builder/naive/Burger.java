package com.github.piyushpatel2005.builder.naive;

public class Burger {
    private boolean onion;
    private boolean tomatoes;
    private boolean lettuce;

    public Burger(boolean onion, boolean tomatoes, boolean lettuce) {
        this.onion = onion;
        this.tomatoes = tomatoes;
        this.lettuce = lettuce;
    }

    public Burger(boolean onion, boolean tomatoes) {
        this(onion, tomatoes, false);
    }

    public Burger(boolean tomatoes) {
        this(false, tomatoes, false);
    }

    public boolean hasOnion() {
        return onion;
    }

    public boolean hasTomatoes() {
        return tomatoes;
    }

    public boolean hasLettuce() {
        return lettuce;
    }
}
