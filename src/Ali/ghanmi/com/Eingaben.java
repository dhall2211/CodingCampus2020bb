package Ali.ghanmi.com;

import java.util.Scanner;

public class Eingaben {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("Enter Ro");
        double Ro = inputRo(7, 12);
        System.out.println("Enter Sph");
        double Fv = inputPower(-40, 40);
        System.out.println("Enter Cylinder");
        double cyl = inputCy(-9, -0.125);
        System.out.println("Enter Diameter");
        double diameter = dia(12, 18);
        System.out.println("Enter Axe");
        double axe = AX(0, 360);
        System.out.println(Ro*2);//calcoulation test
    }

    private static int AX(int min, int max) {
        int intInput = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String ro = sc.nextLine();
                intInput = Integer.valueOf(ro.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid input. Try again.");
                continue;
            }

            if (intInput >= 0 && intInput <= 360) {
                isValidInput = true;
            } else {
                System.out.println("Not within game range (between " + min + " and " + max + "). Try again");
            }
        }
        return intInput;

    }

    private static double dia(double min, double max) {
        double doubleInput = 0.0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String ro = sc.nextLine();
                doubleInput = Integer.valueOf(ro.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid input. Try again.");
                continue;
            }

            if (doubleInput >= 12 && doubleInput <= 18) {
                isValidInput = true;
            } else {
                System.out.println("Not within game range (between " + min + " and " + max + "). Try again");
            }
        }
        return doubleInput;
    }



    public static double inputRo(double min, double max) {
        double doubleInput = 0.0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String ro = sc.nextLine();
                doubleInput = Integer.valueOf(ro.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid input. Try again.");
                continue;
            }

            if (doubleInput >= 7 && doubleInput <= 12) {
                isValidInput = true;
            } else {
                System.out.println("Not within game range (between " + min + " and " + max + "). Try again");
            }
        }
        return doubleInput;
    }

    public static double inputCy(double min, double max) {
        double doubleInput = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String ro = sc.nextLine();
                doubleInput = Integer.valueOf(ro.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid input. Try again.");
                continue;
            }

            if (doubleInput >= -9.0 && doubleInput <= -0.125) {
                isValidInput = true;
            } else {
                System.out.println("Not within game range (between " + min + " and " + max + "). Try again");
            }
        }
        return doubleInput;
    }

    public static double inputPower(double min, double max) {
        double doubleInput = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String ro = sc.nextLine();
                doubleInput = Integer.valueOf(ro.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid input. Try again.");
                continue;
            }

            if (doubleInput >= -40 && doubleInput <= 40) {
                isValidInput = true;
            } else {
                System.out.println("Not within game range (between " + min + " and " + max + "). Try again");
            }
        }
        return doubleInput;
    }
}


