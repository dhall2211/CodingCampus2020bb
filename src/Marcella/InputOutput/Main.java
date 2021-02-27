package Marcella.InputOutput;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
/*
        File io = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus2020bb\\inputOutput");
        try {
            FileWriter fileWriter = new FileWriter(io);
        } catch ();
*/
        Path covidCSV = Paths.get("C:\\Users\\DCV\\IdeaProjects\\CodingCampus2020bb\\temp\\covid19.csv");
        System.out.println(covidCSV);

    }




}
