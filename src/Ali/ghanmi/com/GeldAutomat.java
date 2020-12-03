package Ali.ghanmi.com;

import java.util.Scanner;

public class GeldAutomat {
    //double aktuelleGuthaben = 5000.01;

    public static void cash() {
        Scanner sc = new Scanner(System.in);

        String result = "false";
        String passWort = "2345";
        String carteValidierung = "2021";

        double AlteGuthaben, neueGuthaben, deposit;
        for (int versucheCounter = 0; versucheCounter < 3; versucheCounter++) {
            System.out.println("Carte Validieren");//soll automatisch geprüft werden
            carteValidierung = sc.nextLine();
            System.out.println("Enter passWort");
            passWort = sc.nextLine();

            result = checkID(carteValidierung, passWort);
            if (!result.equals("false")) {
                break;
            } else if (versucheCounter == 2) {// you cannot try to log in anymore than 3
                // times
                System.out.println("MAXIMUM MÖGLICHE VERSUCHE EREICHT");
                return;
            }

        }
        auswalMenu();

    }

    public static String checkID(String cardNr, String passWort) {
        String result = "false";
        if (passWort.equals("2345") && cardNr.equals("2021")) {
            result = "true";
        }
        System.out.println(result);
        return result;
    }

    public static int auswalMenu() {
        int auswahl;
        Scanner sc = new Scanner(System.in);

        System.out.println("Operattion Auswahl: \n1.Konto Zustand\n2.Gelg Abheben\n4.Log Out\n5.Error");
        auswahl = sc.nextInt();

        if (auswahl == 1) {// 1.konto zustand
            kontoZUstand();
            auswalMenu();
            return 1;

        }
        if (auswahl == 2) {// 2. operation
            abheben();
            auswalMenu();
            return 2;

        }
        if (auswahl == 4) {// 4. Abbruch
            System.out.println("Operation verlassen");
            return 4;

        }
        if (auswahl <= 5) {// type in anything greater than 4 and you will get a
            // system error
            System.out.println("Error");
            auswalMenu();
            return 5;

        }
        return auswahl;

    }

    public static void abheben() {
        double aktuelleGuthaben = 5000.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte betrag eingeben:");
        double amount = input.nextDouble();
        System.out.println("Sie haben : " + amount+"ausgewählt");
        aktuelleGuthaben -= amount;
        System.out.println("Your new balance is: " + aktuelleGuthaben);
    }

    public static double kontoZUstand() {
        double aktuelleGuthaben = 5000.01;
        System.out.println("Total balance is: euro: " + aktuelleGuthaben);
        return 1;
    }

}