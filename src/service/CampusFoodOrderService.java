package service;
import config.AppConfig;
import factory.NotificationFactory;
import notification.Notification;
public class CampusFoodOrderService {
	 public void placeOrder(String studentName,
             String foodName,
             String notificationType) {

         AppConfig config = AppConfig.getInstance();
         System.out.println("Order created for: " + studentName);
         System.out.println("Food: " + foodName);
         System.out.println("Delivery fee: "
                 + config.getDeliveryFee() + " TL");
         Notification notification =
        		 NotificationFactory.createNotification(notificationType);
         if (notification != null) {
        	 notification.send(studentName, foodName);
         } else {
        		 System.out.println("Unknown notification type.");
         }
    }
	 
}
