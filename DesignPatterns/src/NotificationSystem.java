public class NotificationSystem {
    public static void main(String[] args) {
        String userPhoneNumber = "(268) 112-8766";
        Notification smsNotification = new SMSNotification(userPhoneNumber);



        // Send a basic notification
        smsNotification.send("System update: Maintenance scheduled for 9:30am.");

        //Email
        String userEmail = "user@gmail.com";

        Notification emailNotification = new EmailNotification(userEmail);

        emailNotification.send("System Update: Detailed record is included.");

        

    }

}
