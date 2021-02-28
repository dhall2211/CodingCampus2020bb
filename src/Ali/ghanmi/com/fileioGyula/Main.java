package Ali.ghanmi.com.fileioGyula;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        File myFile = null;
        do {
            myFile = new File(getFileName("C:\\Users\\DCV\\Desktop\\fileÜbung\\", "hello World ", i,".txt"));
            System.out.println("Versuche: " + myFile.getAbsolutePath() + ": exists? " + myFile.exists());
            ++i;
        } while (myFile.exists());
        System.out.println(myFile.getAbsolutePath());
        try{
            FileWriter fw = new FileWriter(myFile, false);
            fw.write("Hello World!");
            fw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static String getFileName(String directory, String name, int counter, String extension){
        if (counter == 1){
            return directory + name + extension;
        }
        return directory + name + (counter-1)+ extension ;
    }

}
