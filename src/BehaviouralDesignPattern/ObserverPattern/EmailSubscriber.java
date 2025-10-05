package BehaviouralDesignPattern.ObserverPattern;

public class EmailSubscriber implements Subscriber {
    @Override
    public void notifySubscriber(String notification) {
        System.out.println("Email notification send successfully: " + notification);
    }
}
