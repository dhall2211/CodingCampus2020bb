package Ali.ghanmi.com.fileioGyula;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileReadSample {
    public static void main(String[] args) {
        //File myfile = new File("C: User dir", "config_1.txt");

        File myfile = new File("C:\\Users\\DCV\\Documents\\Simon Assessment\\CodingCampus2020bb\\src\\Ali\\ghanmi\\com\\fileioGyula\\sampleFiles\\testfile_3.txt");
        String enc ="iso-8859-2";
        try {
            FileReader myReader = new FileReader(myfile,Charset.forName(enc));
            //BufferedReader myText = new BufferedReader(myReader,Charset.forName(enc));
            BufferedReader myText = new BufferedReader(myReader);
            String line ;
            while ((line = myText.readLine()) != null)
                System.out.println(line);


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

