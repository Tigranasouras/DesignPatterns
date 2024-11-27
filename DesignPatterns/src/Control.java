public class Control {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("DEBUG", "Application is running.");
        logger.log("ERROR", "An error occurred.");
    }
}
