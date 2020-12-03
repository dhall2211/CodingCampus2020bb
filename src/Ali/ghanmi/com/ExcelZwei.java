package Ali.ghanmi.com;

import java.util.Arrays;

public class ExcelZwei {
    public static void main(String[] args) {
        String[] Employee = getSemplyerlist();
        String[][] hourList = gethourlist();

        int hourSalry = 8;
        // int summeStd = 0;
        for (int j = 0; j < Employee.length; j++) {
            int summeStd = 0;
            for (int i = 0; i < hourList.length - 1; i++) {
                if (Employee[j].equals(hourList[i][0])) {
                    summeStd += Integer.parseInt(hourList[i][1]);
                }
            }
            System.out.println(Employee[j] + "  Stdunden Summe:  " + summeStd + "  TotalLoan: " + summeStd * hourSalry);
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(Arrays.toString(Employee));
        for (int i = 0; i < hourList.length; i++) {
            System.out.println(Arrays.toString(hourList[i]));
         //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        }


    }

    private static String[] getSemplyerlist() {
        return new String[]{"Daniel", "Alex", "Michael", "Mia", "frank", "jack"};
    }

    private static String[][] gethourlist() {
        return new String[][]{{"Daniel", "7"},
                {"Alex", "9"},
                {"Michael", "8"},
                {"Daniel", "5"},
                {"Daniel", "3"},
                {"Alex", "7"},
                {"Michael", "6"},
                {"Alex", "4"},
                {"Michael", "5"},
                {"Mia", "5"},
                {"Daniel", "55"},};
    }
}
