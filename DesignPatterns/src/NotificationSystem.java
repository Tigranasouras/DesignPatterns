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

        //Slack
        String workspace = "MainChat";
        String channel = "#Cullinary";

        Notification slackNotificaion = new SlackNotification(workspace, channel);

        slackNotificaion.send("System Update: John has inquired on the audit report");


        User user = new User("Bobby");



user.addNotificationPreference(new SMSNotification("(287) 397-3849"));
user.addNotificationPreference(new EmailNotification("Bobby@gmail.com"));
user.addNotificationPreference(new SlackNotification("MainChat", "#Cullinary"));



    }

}
