package factory;
import notification.EmailNotification;
import notification.Notification;
import notification.PushNotification;
import notification.SmsNotification;
public class NotificationFactory {
	public static Notification createNotification(String type) {

        if (type.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        }

        else if (type.equalsIgnoreCase("SMS")) {
            return new SmsNotification();
        }

        else if (type.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }

        else {
            return null;
        }
    }

}
