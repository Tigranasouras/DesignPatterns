import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;
    private final List<String> logHistory = new ArrayList<>();
    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    //logs message
    public void log(String condition, String message) {
        String logEntry = LocalDateTime.now() + " [" + condition + "] " + message;
        logHistory.add(logEntry);
        System.out.println(logEntry);
    }

    public List<String> getLogHistory() {
        return new ArrayList<>(logHistory);
    }
}
