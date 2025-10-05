package BehaviouralDesignPattern.StratergyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CardPayment());
        paymentProcessor.processPayment();
    }
}
