package Ali.ghanmi.com;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {
    private static Random random = new Random();

    public static void simulate() {

        int width = eingabe(1, 50, "Geben Sie die Breite ein!", "Die Breite muss eine Zahl zwischen 1 und 50 sein.\nGeben Sie bitte noch mal ein!");
        int pos = Math.round(width / 2.0f);

        printfeld(width, pos);
        while (!isBorderReached(width, pos)) {
            pos = moveRandom(pos, 10);
            printfeld(width, pos);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) { /* Ignore */ }
        }
    }

    public static void printfeld(int width, int pos) {
        System.out.print("[");
        for (int i = 1; i < pos; i++) {
            System.out.print(" ");
        }
        System.out.print("X");
        for (int i = pos + 1; i <= width; i++) {
            System.out.print(" ");
        }
        System.out.println("]");
    }

    public static int moveRandom(int oldPos, int chance) {//rondom funktion
        int randomResult = random.nextInt(100);//100%
        if (randomResult < chance) {//wenn das zufall ist kleiner als chance(hier ist mit 10% definiert)
            --oldPos;
        } else if (randomResult < 2 * chance) {//wenn das zufall ist kleiner als chance(hier ist mit 20% definiert)
            ++oldPos;
        }
        return oldPos;
    }

    public static boolean isBorderReached(int width, int pos) {//grenze kontrolieren funktion

        return (pos == 1) || (pos == width);
    }

    public static int eingabe(int minValue, int maxValue, String message1, String message2) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message1);
        int value = Integer.MIN_VALUE;
        while (value == Integer.MIN_VALUE) {
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line.trim());
                if ((value < minValue) || (value > maxValue)) {
                    System.out.println(message2);
                    value = Integer.MIN_VALUE;
                }
            } catch (NumberFormatException nfe) {
                System.out.println(message2);
            }
        }
        return value;
    }

}
