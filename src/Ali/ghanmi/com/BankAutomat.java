package Ali.ghanmi.com;

import java.util.Scanner;

public class BankAutomat {

    public static void chaschService() {
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        System.out.println("Insert Card");
        int expDate = 31122020;
        int dateCheck = sc.nextInt();
        if (dateCheck == (expDate)) {
            isValid = true;

        } else
            System.out.println("No Valid Card Please take Your Card");

        String ms1 = "Enter your PIN";
        String ms2 = "Wrong PIN ,Please Enter your PIN again+\n" +
                "Last two try";
        String ms3 = "Wrong PIN ,Please Enter your PIN again+\n" +
                "Last try";
        String ms4 = "Wrong PIN ,Please contact your bank";
        int pin = 12345;
        int pinTrycount = 0;
        boolean pinCorrect = false;
        if (isValid = true) {
            System.out.println(ms1);
            int Input = sc.nextInt();
            if (Input != pin) {
                pinTrycount++;
                System.out.println(ms2);
                Input = sc.nextInt();
                if (Input != pin) {
                    pinTrycount++;
                    System.out.println(ms3);
                    Input = sc.nextInt();
                    if (Input != pin) {
                        pinTrycount++;
                        System.out.println(ms4);


                    }

                }
            }
        }
    }
}