package Ali.ghanmi.com.covisStatistic;

import Daniel.Logging.LogType;
import Daniel.Logging.SimpleLogger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CsvUtil {
    public static Collection<String[]> loadCsv(Path file, String separator) {
        List<String[]> csv = new LinkedList<>();
        Scanner csvFile = null;
        try {
            csvFile = new Scanner(file, StandardCharsets.UTF_8);
            while (csvFile.hasNextLine()) {
                var line = csvFile.nextLine();
                if (line.length() > 0) {
                    csv.add(line.split(separator));
                }
            }
            csvFile.close();
        } catch (IOException e) {
            SimpleLogger.getInstance().log(LogType.ERROR, "Error loading the csv " + file.toString() + ": " + e.getMessage());
        }
        return csv;
    }

    public static void saveCsv(Path filePath, Collection<String[]> csv, String separator) {
        File file = filePath.toFile();
        FileWriter writer = null;
        try {
            writer = new FileWriter(file, false);
            for (String[] line : csv) {
                writer.write(String.join(separator, line) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            SimpleLogger.getInstance().log(LogType.ERROR, "Error saving the csv " + file.toString() + ": " + e.getMessage());
        }
    }
}
