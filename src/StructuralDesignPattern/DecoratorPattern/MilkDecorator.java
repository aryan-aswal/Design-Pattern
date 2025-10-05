package StructuralDesignPattern.DecoratorPattern;

public class MilkDecorator extends Decorator {
    private Beverage beverage;
    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String description() {
        return "This is a milk decorator";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + (this.beverage.cost() * 0.8);
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
}
