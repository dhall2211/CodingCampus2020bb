package Ali.ghanmi.com.fileioGyula;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ConfigManager {

    private String fileName;
    private String encoding;

    public ConfigManager(String fileName, String encoding) {
        this.fileName = fileName;
        this.encoding = encoding;
    }

    public List<String> getLines() throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName), Charset.forName(encoding));
        return lines;
    }

    public void getLines2() throws IOException { // while-loop, Liste als return-type
        BufferedReader reader = new BufferedReader(new FileReader(fileName, Charset.forName(encoding)));
        String currentLine = reader.readLine();
        reader.close();
        System.out.println(currentLine);
    }

}
