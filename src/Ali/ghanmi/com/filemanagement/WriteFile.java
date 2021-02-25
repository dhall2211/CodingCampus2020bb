package Ali.ghanmi.com.filemanagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {


    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
        //    System.out.println(getFileName("C:\\Users\\DCV\\Desktop\\fileÜbung\\", "Hello World", i, ".txt"));
        }
        try {
//          Path path = Paths.get("C:\\Users\\DCV\\Desktop\\Hello World.txt");
//          File myFile = new File("C:\\Users\\DCV\\Desktop\\Hello World.txt");

            /// myFile.isFile() && myFile.exists()

            for (int i = 1; i < 7; i++) {
                File myFile = new File(getFileName("C:\\Users\\DCV\\Desktop\\fileÜbung\\", "Hello World", i, ".txt"));

                while (myFile.isFile() && myFile.exists()) {
                    System.out.println(myFile + "already exists.");
                    break;
                }
                FileWriter myWriter = new FileWriter(getFileName("C:\\Users\\DCV\\Desktop\\fileÜbung\\", "Hello World", i, ".txt"));
                myWriter.write("Hello World?");
                myWriter.close();

            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileName(String pfad, String name, int counter, String extenstion) {
        if (counter == 1) {
            return pfad + name + extenstion;
        }
        return pfad + name + counter + extenstion;
    }
}
