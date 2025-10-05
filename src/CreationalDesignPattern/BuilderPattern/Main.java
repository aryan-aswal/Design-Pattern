package CreationalDesignPattern.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        House myHouse = new House.HouseBuilder(4, 2)
                .withGarage(true)
                .withSwimmingPool(true)
                .build();
    }
}
