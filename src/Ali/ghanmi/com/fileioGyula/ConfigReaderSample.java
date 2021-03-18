package Ali.ghanmi.com.fileioGyula;

import Ali.ghanmi.com.fileOperation.FileManagerWithInterface;
import Ali.ghanmi.com.fileOperation.IFileReader;
import Ali.ghanmi.com.fileOperation.MainWithInterface;

import java.io.*;
import java.util.*;



    public class ConfigReaderSample implements IConfigReader {
        private HashMap<String, String> configFiles = new HashMap<>();

        public static void main(String[] args) throws IOException {


            String fileName = "C:\\Users\\DCV\\Documents\\Simon Assessment\\CodingCampus2020bb\\src\\Ali\\ghanmi\\com\\fileioGyula\\sampleFiles\\config_3.txt";
            String enc ="iso-8859-2";



            ConfigReaderSample mwi = new ConfigReaderSample();
            ConfigManagerWithInterface fm = new ConfigManagerWithInterface(mwi);
            fm.readFile(fileName,enc);
            for (String key : mwi.configFiles.keySet()) {
                System.out.println(key + " " + mwi.configFiles.get(key));
            }
        }

        @Override
        public void handleNewLine(String line) {
            int posSemiC = line.indexOf(";");
            // Remove commemnt from the line
            if (posSemiC >= 0) line = line.substring(0, posSemiC);
            int posEQ = line.indexOf("=");
            if (posEQ > 0){
                String key = line.substring(0, posEQ).trim();
                String value = line.substring(posEQ+1).trim();
                configFiles.put(key, value);
            } else {
                if (line.trim().length() > 0){
                    System.out.println("Invalid config entry: " + line);
                }
            }
        }
        }