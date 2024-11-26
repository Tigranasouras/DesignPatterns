public class NotificationSystem {
    public static void main(String[] args) {
        Notification smsNotification = new SMSNotification();

        // Send a basic notification
        smsNotification.send("System update: Maintenance scheduled for midnight.");
    }

}
