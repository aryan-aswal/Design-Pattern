package BehaviouralDesignPattern.StratergyPattern;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Processing UPI Payment");
    }
}
