package Ali.ghanmi.com;

import java.util.Scanner;

public class GeldAutomatZwei {


    public static void main(String[] args) {
        boolean isActive = true;
        int acountBalance = 5000;
        while (isActive) {
            int menuItem = chooseMenuIthem();
            switch (menuItem) {
                case 1:
                    shwoAcountBalance(acountBalance);
                    break;

                case 2:
                    acountBalance = withdrawMoney(acountBalance);
                    break;
                case 3:
                    acountBalance = depositMoney(acountBalance);
                    break;
                case 0:
                    salutaion();
                    isActive = false;
            }
        }
    }

    private static void salutaion() {
        System.out.println("danke und aufwiedersehen");

    }

    private static int depositMoney(int acountBalance) {
        while (true) {
            System.out.println("Wie viele möchten sie Einzahlen");
            Scanner sc1 = new Scanner(System.in);
            if (sc1.hasNextInt()) {
                return acountBalance + sc1.nextInt();
            }
        }
    }

    private static int withdrawMoney(int acountBalance) {
        return 0;
    }

    private static void shwoAcountBalance(int acountBalance) {
        System.out.println("ihr aktuelle kontozustand ist:  " + acountBalance);

    }

    private static int chooseMenuIthem() {
        while (true) {
            System.out.println(" 1 = kontostand\n 2 = Auszahlung\n 3 = Eintahlung\n 0 = Benden");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }
    }

}






