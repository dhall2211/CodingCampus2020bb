package Bokhee.FileReaderIO.sampleFiles;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfigReader {
    public static void main(String[] args) {

        // 1. Define path (probably won't change)
        String path = "src\\Bokhee\\FileReaderIO\\sampleFiles\\";

        boolean validFile = false;
        while (!validFile) {
            // 2. Get user input (-> name of the file)
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter filename.");
            String userInput = scanner.nextLine().trim();

            // 3. Read the filedata +´Output data to the console
            String fullpath = path + userInput;


            try {
                File file = new File(fullpath);
                FileReader fileReader = new FileReader(file, Charset.forName("UTF-8"));
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String block = "";
                Map<String, String> configFile = new HashMap<String, String>();

                String line = bufferedReader.readLine();
                while (line != null) {
                    //System.out.println(line);
                    if (line.indexOf(";") >= 0) {
                        line = line.substring(0, line.indexOf(";"));
                    }
                    if (line.indexOf("[") >= 0) {
                        block = line.substring(1 + line.indexOf("["), line.indexOf("]"));
                    }

                    int pos = line.indexOf("=");
                    if (pos >= 0) {
                        String key = line.substring(0, pos).trim();
                        String value = line.substring(pos + 1).trim();
                        if (block.equals("")) {
                            configFile.put(key, value);
                        } else {
                            configFile.put(block + "/" + key, value);
                        }
                    } else {
                        //System.out.println("Ungültige Config Eintrag (ohne = Symbol)");
                    }
                    //System.out.println(Arrays.toString(words));
                    line = bufferedReader.readLine();
                }


                //System.out.println(configFile);
                for (String key : configFile.keySet()) {
                    System.out.println(key + ": " + configFile.get(key));
                }
                validFile = true;

            } catch (FileNotFoundException fnfe) {
                System.out.println("ERROR: The filename you entered does not exist.");

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
