package BehaviouralDesignPattern.ObserverPattern;

public class WhatsappNotification implements Subscriber {
    @Override
    public void notifySubscriber(String notification) {
        System.out.println("Whatsapp Notification send successfully: " + notification);
    }
}
