package Bokhee.FileReaderIO.sampleFiles;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReadFile {
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
                //FileReader fileReader = new FileReader(file);
                //FileReader fileReader = new FileReader(file, Charset.forName("ISO-8859-2") );
                FileReader fileReader = new FileReader(file, Charset.forName("UTF-8") );
              //FileReader file
                // Reader = new FileReader(file, Charset.forName("windows-1252") );
//                Charset.forName(fileReader.getEncoding());
//                System.out.println(Charset.forName(fileReader.getEncoding()));
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
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


