package Marcella.fileOperation;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in); // try catch scanner einbauen
        System.out.println("Enter Filename:");
        String fileName = scanner.next();
        System.out.println("Enter Encoding:");
        String encoding = scanner.next();
        FileManager fileManager = new FileManager(fileName, encoding);

        // fileManager.getLines2();

        List<String> lines = fileManager.getLines();
        // printLines(lines);

        Map<String, String> configFiles = generateMap(lines);
        var map = configFiles.entrySet(); //zur Ausgabe Map
        for (var m : map) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    private static void printLines(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static HashMap<String, String> generateMap(List<String> lines) {
        HashMap<String, String> configFiles = new HashMap<>();
        for (String line : lines) { //prüfen ob key noch nicht da ist
            int posSemiC = line.indexOf(";");
            // Remove commemnt from the line
            if (posSemiC >= 0) line = line.substring(0, posSemiC);
            int posEQ = line.indexOf("=");
            if (posEQ > 0){
                String key = line.substring(0, posEQ).trim();
                String value = line.substring(posEQ+1).trim();
                configFiles.put(key, value);
            } else {
                if (line.trim().length() > 0){
                    System.out.println("Invalid config entry: " + line);
                }
            }

            /*
            if (isValidLine(line)) {
                String[] lineItems = line.split("=");
                String key = lineItems[0].trim();
                String value = lineItems[1].trim();
                configFiles.put(key, value);
            }
             */
        }
        return configFiles;
    }

    private static boolean isValidLine(String line) {
        if (line.startsWith(";") || line.isEmpty()) {
            return false;
        }
        return true;
    }

}
