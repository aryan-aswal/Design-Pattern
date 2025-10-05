package BehaviouralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationSender {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String notification;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
        this.notifySubscribers(notification); // notify on state change
    }

    public void notifySubscribers(String notification) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifySubscriber(notification);
        }
    }
}
