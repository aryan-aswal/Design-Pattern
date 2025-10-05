package StructuralDesignPattern.DecoratorPattern;

public class MilkDecorator extends Decorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + "with milk";
    }

    @Override
    public double cost() {
        return super.cost() + super.cost() * 0.8;
    }

    public Beverage getBeverage() {
        return super.beverage;
    }

    public void setBeverage(Beverage beverage) {
        super.beverage = beverage;
    }
}
