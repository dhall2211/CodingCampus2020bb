package Marcella.fileOperation;

import javax.print.attribute.HashAttributeSet;
import javax.swing.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainWithInterface implements IFileReader {
    private HashMap<String, String> configFiles = new HashMap<>();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in); // try catch scanner einbauen
        System.out.println("Enter Filename:");
        String fileName = scanner.next();
        System.out.println("Enter Encoding:");
        String encoding = scanner.next();

        MainWithInterface mwi = new MainWithInterface();
        FileManagerWithInterface fm = new FileManagerWithInterface(mwi);
        fm.readFile(fileName, encoding);
        for (String key : mwi.configFiles.keySet()) {
            System.out.println(key + " " + mwi.configFiles.get(key));
        }
    }

    @Override
    public void handleNewLine(String line) {
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
    }
}
