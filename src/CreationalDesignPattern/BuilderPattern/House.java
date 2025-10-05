package CreationalDesignPattern.BuilderPattern;

// The complex object we want to create (the "Product")
public class House {
    private int windows;
    private int doors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Constructor is private and takes the builder
    private House(HouseBuilder builder) {
        this.windows = builder.windows;
        this.doors = builder.doors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    // Static nested Builder class
    public static class HouseBuilder {
        private final int windows;
        private final int doors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder(int windows, int doors) {
            this.windows = windows;
            this.doors = doors;
        }
        public HouseBuilder withGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }
        public HouseBuilder withSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
        public House build() {
            return new House(this);
        }
    }
}
