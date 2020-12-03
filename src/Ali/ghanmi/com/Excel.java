package Ali.ghanmi.com;

import java.lang.constant.ConstantDesc;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Excel {
    public static void main(String[] args) {
        String[][] hourList= gehtHaourList();
        gehtHaourList();

        int[] hoursSum = CalculateHourSum(hourList);
        int loanPerHour = 8;
        int[] salary = calculateLoan(hoursSum, loanPerHour);

        printLohn(salary);
    }

    private static void printLohn(int[] salary) {
        System.out.println("Alex bekommt " + salary[0] + "€ ausbezahlt.");
        System.out.println("Daniel bekommt " + salary[1] + "€ ausbezahlt.");
        System.out.println("Michael bekommt " + salary[2] + "€ ausbezahlt.");
    }

    private static int[] CalculateHourSum(String[][] hourList) {
        int[] hoursSum = new int[3];
        for (String[] entry : hourList) {
            String name = entry[0];
            int hoursSumIndex = 0;
            switch (name) {
                case "Alex":
                    hoursSumIndex = 0;
                    break;
                case "Daniel":
                    hoursSumIndex = 1;
                    break;
                case "Michael":
                    hoursSumIndex = 2;
                    break;
            }


            hoursSum[hoursSumIndex] = hoursSum[hoursSumIndex] + Integer.parseInt(entry[1]);
        }
        return hoursSum;
    }
    private static int[] calculateLoan(int[] hoursSum, int loanPerHour) {
        int[] salary = new int[3];
        for (int i = 0; i < hoursSum.length; i++){
            salary[i] = hoursSum[i] * loanPerHour;
        }
        return salary;
    }


    private static String[][] gehtHaourList() {
        String[][] hourList = {{"Daniel", "7"},
                {"Alex", "9"},
                {"Michael", "8"},
                {"Daniel", "5"},
                {"Daniel", "3"},
                {"Alex", "7"},
                {"Michael", "6"},
                {"Alex", "4"},
                {"Michael", "5"}};
        return hourList;
    }
    public static void theLambdaWay(String[][] hourList, int loanPerHour){
        Map<String, Integer> result = Arrays.stream(hourList)
                .collect(Collectors.toMap(
                        entry -> entry[0],
                        entry -> Integer.parseInt(entry[1]) * loanPerHour,
                        Integer::sum));
        for (var entry:result.entrySet()) {
            System.out.println(entry.getKey() + " bekommt " + entry.getValue() + "€ ausbezahlt.");
        }
    }


    }


/*
    int loanPerHour = 8;
        int[] hoursSum = new int[3];
        for (String[] entry : hourList) {
            String name = entry[0];
            int hoursSumIndex = 0;
            switch (name) {
                case "Alex":
                    hoursSumIndex = 0;
                    break;
                case "Daniel":
                    hoursSumIndex = 1;
                    break;
                case "Michael":
                    hoursSumIndex = 2;
                    break;
            }


            hoursSum[hoursSumIndex] = hoursSum[hoursSumIndex] + Integer.parseInt(entry[1]);
        }
            System.out.println("Alex Std Summe:    "+hoursSum[0]+ "  Alex Lohn:    " +hoursSum[0]*loanPerHour);
            System.out.println( "Daniel Std Summe:  "+hoursSum[1]+ "  Daniel Lohn:  "+ hoursSum[1]*loanPerHour);
            System.out.println( "Michael Std Summe: "+hoursSum[2]+ "  Michael Lohn: "+ hoursSum[2]*loanPerHour);
        }
        /*
        String[][] myexcel = new String[9][2];
        myexcel[0][0]= "daniel";
        myexcel[1][0]="Alex";
        myexcel[2][0] ="Michael";
        myexcel[3][0]="daniel";
        myexcel[4][0]="daniel";
        myexcel[5][0]="Alex";
        myexcel[6][0]="Michael";
        myexcel[7][0]="Alex";
        myexcel[8][0]="Michael";

        myexcel[0][1]= "7";
        myexcel[1][1]="9";
        myexcel[2][1] ="8";
        myexcel[3][1]="5";
        myexcel[4][1]="3";
        myexcel[5][1]="7";
        myexcel[6][1]="6";
        myexcel[7][1]="4";
        myexcel[8][1]="5";

        System.out.println(myexcel.length[1][0]);
       */




