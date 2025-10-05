package BehaviouralDesignPattern.StratergyPattern;

public class CashPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Cash Payment");
    }
}
