package BehaviouralDesignPattern.ObserverPattern;

public class PushNotificationSubscriber implements Subscriber {
    @Override
    public void notifySubscriber(String notification) {
        System.out.println("Push Notification send successfully: " + notification);
    }
}
