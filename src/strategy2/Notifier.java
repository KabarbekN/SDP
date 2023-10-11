package strategy2;

public class Notifier {
    private NotificationStrategy notificationStrategy;

    public Notifier() {
    }

    public Notifier(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public NotificationStrategy getNotificationStrategy() {
        return notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }


    public void makeNotification(String contactDetails, String message){
        if (notificationStrategy != null){
            notificationStrategy.sendNotification(contactDetails, message);
        }
    }
}
