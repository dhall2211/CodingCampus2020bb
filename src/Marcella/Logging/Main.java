package Marcella.Logging;

public class Main {

    public static void main(String[] args) {
        SimpleLogger logger = SimpleLogger.getInstance();
        logger.log(LogType.INFO, "Test");
    }

}
