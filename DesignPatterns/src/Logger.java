import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;


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

    private void writeToFile(String logEntry){
        String logFilePath = "Event.log"; // turned this into a local variable
        try (FileWriter writer = new FileWriter(logFilePath, true)){
            writer.write(logEntry + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Failed  to write log to file: " + e.getMessage()); //found this solution while re-learning how to do the writer.
        }
    }

    //logs message
    public void log(String condition, String message) {
        String logEntry = LocalDateTime.now() + " [" + condition + "] " + message;
        logHistory.add(logEntry);
        System.out.println(logEntry);
        writeToFile(logEntry);

    }

    public List<String> getLogHistory() {
        return new ArrayList<>(logHistory);
    }
}
