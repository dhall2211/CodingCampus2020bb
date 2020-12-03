package Ali.ghanmi.com;

import java.util.Scanner;

public class GeldautomatDrei {


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
       int amount = getScannerInput(" 1 = kontostand\n 2 = Auszahlung\n 3 = Eintahlung\n 0 = Benden" );
        return acountBalance + amount;
    }

    private static int withdrawMoney(int acountBalance) {
        return 0;
    }

    private static void shwoAcountBalance(int acountBalance) {
        System.out.println("ihr aktuelle kontozustand ist:  " + acountBalance);

    }

    private static int chooseMenuIthem() {
        return getScannerInput(" 1 = kontostand\n 2 = Auszahlung\n 3 = Eintahlung\n 0 = Benden");
    }

    private static int getScannerInput(String text) {
        while (true) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }
    }

}



