package strategy2;

public class SMSNotificationStrategy implements NotificationStrategy{
    @Override
    public void sendNotification(String contactDetails, String message) {
        System.out.println("sms notification " + contactDetails + message);

    }
}
