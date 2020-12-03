package com.company;

import java.util.Scanner;

public class BankAccount {

    // user must login
    // user must choose from a menu deposit, withdrawal, balance, exist


    public static void main(String[] args) {
        int[] currentBalance = {100000};
        boolean notAuthenticatedCustomer = true;
        while (notAuthenticatedCustomer) {
            String secretNumber = login();
            boolean result = isAuthenticated(secretNumber);
            if (result) {
                notAuthenticatedCustomer = false;
            } else {
                System.out.println("Pin incorrect please try again");
            }
        }

        String result = chooseMenuItem(currentBalance);
        System.out.println(result);


    }

    public static String chooseMenuItem(int[] currentBalance) {
       Scanner mySelection = new Scanner(System.in);
       String selection;
        System.out.println("Please make a selection");
        System.out.println("Account Balence = 1, Deposit = 2 Withdrawal = 3 Logout = 4 ");
        System.out.println("Please make a selection");
         selection = mySelection.nextLine();
        return switch (selection) {
            case "1" -> getBalance( currentBalance);
            case "2" -> makeDeposit(currentBalance);
            case "3" -> makeWithDrawl(currentBalance);
            case "4" -> logout();
            default -> "please make a proper selection!";
        };

    }

    public static String login() {
       Scanner myPin = new Scanner(System.in);
        System.out.println("Welcome to Bank of Dan.");
        System.out.println("Enter pin: ");
        return myPin.nextLine();
    }

    public static boolean isAuthenticated(String secretNumber) {
        String pin = "12345";
        return pin.equals(secretNumber);


    }

    public static String getBalance(int[] currentBalance) {
        String text = Integer.toString(currentBalance[0]);
        return "Your current balance is " + text + " euros";
    }

    public static String makeDeposit(int[] currentBalance) {
        Scanner myDeposit = new Scanner(System.in);
        int amount;
        System.out.println("please enter the amount you would like to deposit ");
        amount = myDeposit.nextInt();
        currentBalance[0] =  amount + currentBalance[0];
        String cb = Integer.toString(currentBalance[0]);
        return "your new balance is " + cb + " euros";
    }

    public static String makeWithDrawl(int[] currentBalance) {
        Scanner myDeposit = new Scanner(System.in);
        int amount;
        System.out.println("please enter the amount you would like to withdrawl ");
        amount = myDeposit.nextInt();
        currentBalance[0] =  amount - currentBalance[0];
        String cb = Integer.toString(currentBalance[0]);
        return "your new balance is " + cb + " euros";
    }

    public static String logout() {
        return "Thank you for choosing Bank of Dan";
    }

}
