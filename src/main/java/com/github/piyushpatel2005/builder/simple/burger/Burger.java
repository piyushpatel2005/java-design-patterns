package com.github.piyushpatel2005.builder.simple.burger;

public class Burger {

    private String breadType;
    private boolean onion;
    private boolean tomatoes;
    private boolean lettuce;
    private boolean cheese;

    private Burger(String breadType, boolean onion, boolean tomatoes, boolean lettuce, boolean cheese) {
        this.breadType = breadType;
        this.onion = onion;
        this.tomatoes = tomatoes;
        this.lettuce = lettuce;
        this.cheese = cheese;
    }

    public static class Builder {
        private Burger burger = new Burger("", false, false, false, false);

        public Builder withBread (String breadType) {
            burger.breadType = breadType;
            return this;
        }

        public Builder withTomatoes() {
            burger.tomatoes = true;
            return this;
        }

        public Builder withOnion() {
            burger.onion = true;
            return this;
        }

        public Builder withLettuce() {
            burger.lettuce = true;
            return this;
        }

        public Builder withCheese() {
            burger.cheese = true;
            return this;
        }

        public Burger build() {
            return burger;
        }

    }

    @Override
    public String toString() {
        return "Burger{" +
                "breadType='" + breadType + '\'' +
                ", onion=" + onion +
                ", tomatoes=" + tomatoes +
                ", lettuce=" + lettuce +
                ", cheese=" + cheese +
                '}';
    }
}
