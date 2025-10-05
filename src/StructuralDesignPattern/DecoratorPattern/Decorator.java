package StructuralDesignPattern.DecoratorPattern;

public abstract class Decorator implements Beverage {
    protected Beverage beverage;

    public Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost();
    }

    public String description() {
        return this.beverage.description();
    }
}
