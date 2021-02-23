package Ali.ghanmi.com.Logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLogger {
    private static final String LOG_FILE_PATH = "log.txt";
    private static SimpleLogger instance;
    private final File logfile;

    private SimpleLogger() {
        logfile = new File(LOG_FILE_PATH);
        System.out.println("Logfile: " + logfile.getAbsolutePath());
    }

    public static SimpleLogger getInstance() {
        if (instance == null) {
            instance = new SimpleLogger();
        }
        return instance;
    }

    public void log(LogType type, String message) {
        String formattedMessage = getFormattedMessage(type, message);
        System.out.println(formattedMessage);
        writeToLogfile(formattedMessage);
    }

    private void writeToLogfile(String formattedMessage) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(logfile, true);
            writer.append(formattedMessage + "\n");
        } catch (IOException e) {
            System.err.println("error writing to file " + LOG_FILE_PATH);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("error closing writer for file " + LOG_FILE_PATH);
                }
            }
        }
    }

    private String getFormattedMessage(LogType type, String message) {
        Date now = new Date();
        // https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm");

        String date = dateFormat.format(now);
        String time = timeFormat.format(now);

        return String.join(" - ", date, time, type.toString(), message);
    }
}
