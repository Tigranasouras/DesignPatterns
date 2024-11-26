public class NotificationSystem {
    public static void main(String[] args) {
        String userPhoneNumber = "(268) 112-8766";
        Notification smsNotification = new SMSNotification(userPhoneNumber);



        // Send a basic notification
        smsNotification.send("System update: Maintenance scheduled for 9:30am.");
    }

}
