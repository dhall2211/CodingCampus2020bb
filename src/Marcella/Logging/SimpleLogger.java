package Marcella.Logging;

import java.util.Date;

// Singleton
public class SimpleLogger {
    private static SimpleLogger instance;

    private SimpleLogger() {
    }

    public static SimpleLogger getInstance() {
        if (instance == null) {
            instance = new SimpleLogger();
        }
        return instance;
    }

    public void log(LogType type, String message) {
        String formatedMessage = createFormatedMessage(type, message);
        System.out.println(formatedMessage);
      // toDo  writeToLogfile(formatedMessage);
    }

    private String createFormatedMessage(LogType type, String message) {
        String actualDate = new Date().toString();
        return String.join(" - ", actualDate, type.toString(), message);
    }

}


