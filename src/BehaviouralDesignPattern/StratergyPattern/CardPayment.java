package BehaviouralDesignPattern.StratergyPattern;

public class CardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Card Payment");
    }
}
