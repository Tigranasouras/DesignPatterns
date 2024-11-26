public class SlackNotification implements Notification{
    private String workspace;
    private String channel;


    public SlackNotification(String workspace, String channel){
        this.workspace = workspace;
        this.channel = channel;
    }


    @Override
    public void send(String message){
        System.out.println("Sending Slack message to workspace: " + workspace + ", channel: " + channel + ". Message: " + message);
    }
}
