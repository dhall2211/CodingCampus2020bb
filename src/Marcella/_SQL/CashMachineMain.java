package Marcella._SQL;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class CashMachineMain {

    public static void main(String[] args) {

        boolean isActive = true;
        while (isActive) {
            String accountNumber = getScannerInput("Guten Tag. Bitte geben Sie Ihre Kontonummer ein.");
            String pin = getScannerInput("Bitte geben Sie Ihre PIN ein.");

            if (CashMachineDB.checkIfAccountExists(accountNumber, pin)) {
                System.out.println("Login successfully.");
                boolean isLogedIn = true;

                while (isLogedIn) {
                    int menueItem = Integer.parseInt(chooseMenueItem());
                    switch (menueItem) {
                        case 1:
                            CashMachineDB.showAccountBalance(accountNumber);
                            break;
                        case 2:
                            CashMachineDB.withdrawMoney(accountNumber);
                            break;
                        case 3:
                            CashMachineDB.depositMoney(accountNumber);
                            break;
                        case 4:
                            CashMachineDB.exportCSV(accountNumber, "export.csv");
                            break;
                        case 0:
                            salutation();
                            isLogedIn = false;
                    }
                }

            } else {
                System.out.println("Login wasn't successful");
            }

            isActive = false;
            }

        }

    public static String getScannerInput(String text) {
        while (true) {
            System.out.println(text);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
        }
    }

    private static String chooseMenueItem() {
        return getScannerInput("Please choose: \n0: quit \n1: balance \n2: withdraw \n3: deposit \n4: export CSV");
    }

    private static void salutation() {
        System.out.println("Goodbye.");
    }

}
