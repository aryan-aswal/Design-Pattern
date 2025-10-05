package StructuralDesignPattern.DecoratorPattern;

public class ChocolateDecorator extends Decorator {
    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return super.description() + "with chocolate";
    }

    @Override
    public double cost() {
        return super.cost() + (super.cost() * 0.5);
    }

    public Beverage getBeverage() {
        return super.beverage;
    }

    public void setBeverage(Beverage beverage) {
        super.beverage = beverage;
    }
}
