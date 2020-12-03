package Ali.ghanmi.com;


    import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

    public class StundenDaniel {
        public static void main(String[] args) {
            String[][] hourList = getHoursList();
            checkHourList(hourList);

            String[] employees = getEmployees(hourList);

            int[] hoursSum = calculateHoursSum(hourList, employees);

            int loanPerHour = 8;
            int[] salary = calculateLoan(hoursSum, loanPerHour, employees);

            printLoan(salary, employees);
            saveArrayToFile("C:\\Users\\DCV\\Downloads\\loan.csv", salary, employees);

            //theLambdaWay(hourList, loanPerHour);
        }

        private static void saveArrayToFile(String filePath, int[] salary, String[] employees) {
            try {
                Files.createFile(Paths.get(filePath));
                for (int i = 0; i < employees.length; i++) {
                    String line = employees[i] + "," + salary[i] + "\n";
                    Files.write(Paths.get(filePath), line.getBytes(), StandardOpenOption.APPEND);
                }
            } catch (IOException e) {
                System.err.println("Error writing CSV file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        private static void checkHourList(String[][] hourList) {
            for (int i = 0; i < hourList.length; i++) {
                var name = hourList[i][0];
                var hours = hourList[i][1];
                if (name == null || !isValidInt(hours)) {
                    System.out.println("Fehler im CSV, Zeile " + i);
                    hourList[i] = new String[2];
                }
            }
        }

        private static boolean isValidInt(String hours) {
            try {
                Integer.parseInt(hours);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private static String[] getEmployees(String[][] hourList) {
            String employeeNames = "";
            for (String[] row :
                    hourList) {
                String nameWithSeparator = "#" + row[0] + "#";
                if (!employeeNames.contains(nameWithSeparator) && row[0] != null) {
                    employeeNames += nameWithSeparator;
                }
            }
            return employeeNames.substring(1).split("(#)+");
        }

        private static void printLoan(int[] salary, String[] employees) {
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i] + " bekommt " + salary[i] + "€ ausbezahlt.");
            }
        }

        private static int[] calculateLoan(int[] hoursSum, int loanPerHour, String[] employees) {
            int[] salary = new int[employees.length];
            for (int i = 0; i < hoursSum.length; i++) {
                salary[i] = hoursSum[i] * loanPerHour;
            }
            return salary;
        }

        private static int[] calculateHoursSum(String[][] hourList, String[] employees) {
            int[] hoursSum = new int[employees.length];
            for (String[] entry : hourList) {
                String name = entry[0];
                if (name != null) {
                    int hoursSumIndex = Arrays.asList(employees).indexOf(name);
                    hoursSum[hoursSumIndex] = hoursSum[hoursSumIndex] + Integer.parseInt(entry[1]);
                }
            }
            return hoursSum;
        }

        private static String[][] getHoursList() {
            String[][] hourList = {{"Daniel", "wrong"},
                    {"Daniel", "7"},
                    {"Alex", "9"},
                    {"Michael", "8"},
                    {"Daniel", "5"},
                    {"Daniel", "3"},
                    {"Alex", "7"},
                    {"Michael", "6"},
                    {"Alex", "4"},
                    {"Michael", "5"},
                    {"Ali", "9"},
                    {"Ali", "9.0"}
            };
            return hourList;
        }

        public static void theLambdaWay(String[][] hourList, int loanPerHour) {
            Map<String, Integer> result = Arrays.stream(hourList)
                    .collect(Collectors.toMap(
                            entry -> entry[0],
                            entry -> Integer.parseInt(entry[1]) * loanPerHour,
                            Integer::sum)
                    );
            for (var entry : result.entrySet()) {
                System.out.println(entry.getKey() + " bekommt " + entry.getValue() + "€ ausbezahlt.");
            }
        }
    }

