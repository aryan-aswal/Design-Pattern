package StructuralDesignPattern.DecoratorPattern;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * A perfect real-life example of the Decorator Pattern in Java is the java.io package, especially how I/O streams
 * are structured.
 * How it’s a Decorator Pattern:
 * FileReader → base component (basic reading):
 * BufferedReader → decorator (adds extra functionality)
 * You can stack multiple decorators like:
 */
public class Main {
    public static void main(String[] args) {
        Beverage latte = new MilkDecorator(new Espresso());
        Beverage mocha = new ChocolateDecorator(new Espresso());
        System.out.println("Latte Cost: " + latte.cost());
        System.out.println("Mocha Cost: " + mocha.cost());

        try {
            // FileReader is the core component (base functionality)
            FileReader fileReader = new FileReader("data.txt");

            // BufferedReader is the decorator that adds buffering & readLine() feature
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getLocalizedMessage());
        }
    }
}
