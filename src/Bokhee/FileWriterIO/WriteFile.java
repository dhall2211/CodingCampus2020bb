package Bokhee.FileWriterIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {


        File myFile = null;
        for (int i = 1 ; i < 10; i++) {

            do {
                myFile = new File(getFileName("C:\\Users\\DCV\\Desktop\\", "Hello World", i, ".txt"));
                System.out.println("Versuche: " + myFile.getAbsolutePath() + ": exixtis? " + myFile.exists());
//                ++i;
                break;

            } while (myFile.exists());
            System.out.println(myFile.getAbsolutePath());

            try {
                FileWriter fw = new FileWriter(myFile, false);
                fw.write("Hello World!");
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static String getFileName(String pfad, String name, int counter, String extention) {
        if (counter == 1) {
            return pfad + name + extention;
        }
        return pfad + name + counter + extention;
    }
}
