package Ali.ghanmi.com.fileOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileManager {

    private String fileName;
    private String encoding;

    public FileManager(String fileName, String encoding) {
        this.fileName = fileName;
        this.encoding = encoding;
    }

    public List<String> getLines() throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName), Charset.forName(encoding));
        return lines;
    }


}
