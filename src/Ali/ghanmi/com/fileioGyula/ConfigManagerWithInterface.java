package Ali.ghanmi.com.fileioGyula;

import Ali.ghanmi.com.fileOperation.IFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConfigManagerWithInterface {
    private IConfigReader fileReader;

    public ConfigManagerWithInterface(IConfigReader fileReader){
        this.fileReader = fileReader;
    }


    public void readFile(String fileName, String encoding){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName, Charset.forName(encoding)));
            while (reader.ready()) {
                String currentLine = reader.readLine();
                fileReader.handleNewLine(currentLine);
            }
            reader.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

