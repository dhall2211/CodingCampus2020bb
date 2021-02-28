package Marcella.fileOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileManagerWithInterface {
    private IFileReader fr;

    public FileManagerWithInterface(IFileReader fr){
        this.fr = fr;
    }


    public void readFile(String fileName, String encoding){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName, Charset.forName(encoding)));
            while (reader.ready()) {
                String currentLine = reader.readLine();
                fr.handleNewLine(currentLine);
            }
            reader.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}

