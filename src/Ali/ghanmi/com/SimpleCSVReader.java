package Ali.ghanmi.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class SimpleCSVReader {

    public static String[][] readCSV(String filename, String separator) {
        Vector<String[]> content = new Vector<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (br.ready()) {
                String line = br.readLine();
                content.add(line.split(separator));
            }
            br.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return content.toArray(String[][]::new);
    }
}

