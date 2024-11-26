import java.util.ArrayList;
import java.util.List;
public class User {
    private String name;
    private List<Notification> notificationPrefernces;

public User(String name){
    this.name = name;
    this.notificationPrefernces = new ArrayList<>();
}

public void addNotificationPreference(Notification notification){
    notificationPrefernces.add(notification);
}

public void notify(String message){
    System.out.println("Notifying " + name + "...");
    for (Notification notification : notificationPrefernces){
        notification.send(message);
    }

}

}

