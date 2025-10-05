package StructuralDesignPattern.DecoratorPattern;

public class Espresso extends Beverage {

    @Override
    public String description() {
        return "This is a Espresso";
    }

    @Override
    public double cost() {
        return 100;
    }
}
