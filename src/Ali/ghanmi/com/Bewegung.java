package Ali.ghanmi.com;

import java.util.Random;


public class Bewegung {
    private static Random random = new Random();

    public static void simulate() {
        int width = 5;
        int pos = Math.round(width / 2.0f);

        printfeld(width, pos);
        while (!isBorderReached(width, pos)) {
            pos = moveRandom(pos, 10);
            printfeld(width, pos);
            try { Thread.sleep(50); } catch (InterruptedException ie) { /* Ignore */ }
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
        if (randomResult < chance){//wenn das zufall ist kleiner als chance(hier ist mit 10% definiert)
            --oldPos;
        } else if (randomResult < 2*chance){//wenn das zufall ist kleiner als chance(hier ist mit 20% definiert)
            ++oldPos;
        }
        return oldPos;
    }

    public static boolean isBorderReached(int width, int pos) {//grenze kontrolieren funktion
        return (pos == 1) || (pos == width);
    }

/*
        int aktuelPosition = pos;
        while (true) {
            new Random().nextInt(2);
            if (random.nextInt()==0) {
                aktuelPosition = pos - 1;
                if (random.nextInt()==1) {
                    aktuelPosition = pos + 1;
                }
                if (aktuelPosition == 0 || aktuelPosition == width) {
                    break;
                }

            }

            System.out.println(aktuelPosition);

*/



}

