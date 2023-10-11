package strategy2;

public class EmailNotificationStrategy implements NotificationStrategy{
    @Override
    public void sendNotification(String contactDetails, String message) {
        System.out.println("email notification " + contactDetails + message);
    }
}
