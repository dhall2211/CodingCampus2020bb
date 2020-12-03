package Ali.ghanmi.com;

import java.util.Arrays;
import java.util.Scanner;

public class StundenRechnung {
    public static void main(String[] args) {
        String[][] stunden = SimpleCSVReader.readCSV("C:\\Users\\DCV\\Downloads\\Stunden.csv", ",");
    // String[] employee = {"Daniel", "Alex", "Michael", "Mia", "frank", "jack"};
        String[] employee = arrName(stunden);

        int hourSalry = 8;
        // int summeStd = 0;
        for (int j = 0; j < employee.length; j++) {
            int summeStd = 0;
            int arbeitsTage = 0;
            for (int k = 1; k < stunden.length; k++) {
                if (employee[j].equals(stunden[k][0])) {
                    summeStd += Integer.parseInt(stunden[k][1]);
                    arbeitsTage++;

                }
            }
            if (arbeitsTage > 0) {
                double Durchschnitt = (summeStd * hourSalry) / arbeitsTage;
                System.out.println(employee[j] + ":  Stdunden Summe:   " + "  " + summeStd + "\n" +
                        "        TotalLoan: $   " + "     " + summeStd * hourSalry + "\n" +
                        "        Arbeit Tage Summe:  " + arbeitsTage + "\n" +
                        "        Durschnitt Tagslohn: " + Durchschnitt);
            } else {
                System.out.println(employee[j] + ":      hat nichts gemeldet.");
            }

            System.out.println("========================");
            /*
            int countMitarbeiter = countMA(stunden);
            System.out.println(countMitarbeiter);

            arrName(stunden);
             */

        }
    }

    public static int countMA(String[][] stunden) {
        int countname = 0;
        String namenall = "%";
        for (int i = 1; i < stunden.length; i++) {
            if (namenall.indexOf("%" + stunden[i][0] + "%") < 0) {
                namenall += stunden[i][0] + "%";
                countname++;
            }

            //System.out.println(namenall);

        }

        return countname;

    }

    public static String[] arrName(String[][] stunden) {
        int countname = 0;
        String namenall = "%";
        for (int i = 1; i < stunden.length; i++) {
            if (namenall.indexOf("%" + stunden[i][0] + "%") < 0) {
                namenall += stunden[i][0] + "%";

            }
        }
        String[] list = namenall.substring(1).split("%");


        return list;
    }
}

