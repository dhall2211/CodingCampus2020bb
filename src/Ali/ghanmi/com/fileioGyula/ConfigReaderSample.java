package Ali.ghanmi.com.fileioGyula;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;

public class ConfigReaderSample {
    public static void main(String[] args) {
        File myfile = new File("C:\\Users\\DCV\\Documents\\Simon Assessment\\CodingCampus2020bb\\src\\Ali\\ghanmi\\com\\fileioGyula\\sampleFiles\\config_1.txt");

        try {
            FileReader myReader = new FileReader(myfile);
            BufferedReader myText = new BufferedReader(myReader);
            String line;
            while ((line = myText.readLine()) != null)
                System.out.println(line);


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        HashMap<File, File> files = new HashMap<>();
        files.put(myfile, myfile);
        for (File f : files.keySet()) {
            System.out.println(f);

        }
    }
}

