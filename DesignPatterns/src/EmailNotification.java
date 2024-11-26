public class EmailNotification implements Notification{
    private String emailAddress;

    public EmailNotification(String emailAddress){
        this.emailAddress = emailAddress;
    }

    @Override
    public void send(String message){
        System.out.println("Sending Email to " + emailAddress + ": " + message);
    }

}
