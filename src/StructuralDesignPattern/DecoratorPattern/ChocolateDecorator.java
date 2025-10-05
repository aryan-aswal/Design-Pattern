package StructuralDesignPattern.DecoratorPattern;

public class ChocolateDecorator extends Decorator {
    private Beverage beverage;

    public ChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return "This is a chocolate decorator";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + (this.beverage.cost() * 0.5);
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
