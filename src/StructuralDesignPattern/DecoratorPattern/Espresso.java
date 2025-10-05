package StructuralDesignPattern.DecoratorPattern;

public class Espresso implements Beverage {
    @Override
    public String description() {
        return "This is a Espresso";
    }

    @Override
    public double cost() {
        return 100;
    }
}
