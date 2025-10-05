package StructuralDesignPattern.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Beverage latte = new MilkDecorator(new Espresso());
        Beverage mocha = new MilkDecorator(new Espresso());
        System.out.println("Latte Cost: " + latte.cost());
        System.out.println("Mocha Cost: " + mocha.cost());
    }
}
