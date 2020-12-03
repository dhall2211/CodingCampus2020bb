package ghanmi.com.OOP_CampusOrganisation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalTime;

public class OOPCampusOrganisation {

    public static void main(String[] args) {
        ///student&trainer and adress new generat with Constructor
        Participant student1 = new Participant("Hans", "petersan", "beginner",
                "417625001", "test.test@gmail.com", "BlumenStrasse", "12", 6400, "Lustenau", "Östereich");
        Adress adress2 = new Adress("hofstrasse", "182", 9999, "SG", "Schweiz");

        Participant student2 = new Participant("Peter", "Hofmann", "beginner",
                "0041712223333", "test2.test@gmail.com", adress2);

        Participant trainer01 = new Participant("Daniel", "Lee", "Sofwear Developer Senior",
                "417625001", "lee.test@gmail.com", "frienden", "10A", 9000,
                "Brengenz", "Östereich");

        //student,trainer,adress,Romms and scool new generat without with setter input
        Adress adress3 = new Adress();
        Participant trainer02 = new Participant();
        trainer02.setFirstName("Alex");
        trainer02.setLastName("Evans");
        trainer02.setAdress(adress2);
        trainer02.setAdress("hof", "11", 9000, "ad", "ch");///
        adress3.setStreet("Nirvana");
        System.out.println("Testing  \n" + trainer02);
        //// scool
        Scool instution = new Scool();
        instution.setScoolName("vorarlberger kommerzkammer");
        instution.setRommNum(30);
        System.out.println(instution);
        /////Romms
        Romms romm1 = new Romms();
        romm1.setRommNum(22);
        romm1.setWorkPlace(12);
        romm1.setEquipment("13 Pc, coffee maker, Big Screen.");
        System.out.println("\n" + (romm1));
        /////Courses
        Courses programiereJava = new Courses();
        programiereJava.setCoursDesignation("Digital Campus");
        programiereJava.setCousDiscreption("intensive Grundausbildung in Java, Html und Web");
        programiereJava.setDuration(10);
        programiereJava.setStartDate(13, 9, 2020);
        programiereJava.setEndDate(31, 7, 2021);
        programiereJava.setStartTime(LocalTime.of(17, 00));
        programiereJava.setEndTime(LocalTime.of(22, 00));
        programiereJava.setCoursDays("Diestag Donnersteg Samstag");
        System.out.println(programiereJava);

        ///print in main
        System.out.println("student 1 Angaben \n" + student1 + "\n************************");
        System.out.println("student 2 Angaben \n" + student2 + "\n************************");
        System.out.println("Trainer  \n" + trainer01 + "\n************************");

        //print with PrintMethoden
        PrintParticipant(student1);
        PrintParticipant(trainer02);


        ///list of participant generat list with methoden.
        Participant[] ListOfParticipant = new Participant[]{student1, student2, trainer01};
        saveArrayToFile("C:\\Users\\DCV\\Downloads\\XMAX_Gift.csv", ListOfParticipant);

        ///Gesamte kurs in CSV zurückgeben

        String[] kurs = new String[]{String.valueOf(instution), String.valueOf(romm1), String.valueOf(programiereJava),String.valueOf(student1), String.valueOf(student2),
                String.valueOf(trainer01)};
        String filePath2 = "C:\\\\Users\\\\DCV\\\\Downloads\\\\kurs.csv";
        try {
            Files.createFile(Paths.get(filePath2));
            for (int i = 0; i < kurs.length; i++) {
                String line = kurs[i] + "\n********\n\n";
                Files.write(Paths.get(filePath2), line.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }




    private static void saveArrayToFile(String filePath, Participant[] listOfParticipant) {
        try {
            Files.createFile(Paths.get(filePath));
            for (int i = 0; i < listOfParticipant.length; i++) {
                String line = listOfParticipant[i] + "\n********\n\n";
                Files.write(Paths.get(filePath), line.getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }


    //print Metoden
    public static void PrintParticipant(Participant Participant) {
        System.out.printf("\n" + "%-10s %-10s", Participant.getFirstName(), Participant.getLastName() + "\n" +
                "************************");
    }

}
