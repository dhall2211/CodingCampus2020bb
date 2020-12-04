package com.company;

import java.util.Arrays;

public class Wages {
    public static void main(String[] args) {
        String[][] workerWages = getHoursList();
        int[] hoursSum = calculateHoursSum(workerWages);
        int loanPerHour = 8;
        int[] salary = calculateLoan(hoursSum, loanPerHour);
        printLoan(salary);
    }

    private static void printLoan(int[] salary) {
        System.out.println("Alex bekommt " + salary[0] + "€ ausbezahlt.");
        System.out.println("Daniel bekommt " + salary[1] + "€ ausbezahlt.");
        System.out.println("Michael bekommt " + salary[2] + "€ ausbezahlt.");
    }

     
    private static int[] calculateLoan(int[] hoursSum, int loanPerHour) {
        int[] salary = new int[3];
        for (int i = 0; i < hoursSum.length; i++){
            salary[i] = hoursSum[i] * loanPerHour;
        }
        return salary;
    }


    private static int[] calculateHoursSum(String[][] workerWages) {
        int[] hoursSum = new int[3];

        for ( String[] wage: workerWages) {
            int hoursIndex = 0;
            String name = wage[0];
            switch (name) {
                case "Alex":
                    hoursIndex = 0;
                    break;
                case "Daniel":
                    hoursIndex = 1;
                    break;
                case "Michael":
                    hoursIndex = 2;
                    break;

            }
            hoursSum[hoursIndex]= hoursSum[hoursIndex] + Integer.parseInt(wage[1]);

        }
        return hoursSum;
    }


    private static String[][] getHoursList() {
        String [][] workerWages = {{"Daniel","7"},
                {"Alex","8"},
                {"Michael","8"},
                {"Daniel","5"},
                {"Daniel","3"},
                {"Alex","7"},
                {"Alex","4"},
                {"Michael","6"},
                {"Michael","5"}
        };
        return workerWages;
    }
}
