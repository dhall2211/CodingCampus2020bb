package Ali.ghanmi.com;

import java.util.Random;

public class RandomSumme {
    /*
    public static void zufallSumme() {


        Random zufall = new Random();
        int summe = 0;
        int wurf = 0;
        while (true) {
            wurf = zufall.nextInt(20) + 10;
            if (wurf == 15 || wurf ==25) {
                break;

            } else {
                summe = summe + wurf;


                System.out.println(summe);

            }
        }
    }
}

     */
    public static void zufallSumme() {


        Random zufall = new Random();
        int summe = 0;
        int wurf = 0;

        loop: while (true) {
            wurf = zufall.nextInt(20) + 10;
            switch (wurf) {
                case 15:
                case 25:
                    break loop;
                default:
                    summe = summe + wurf;

            }
                System.out.println(summe);

            }
        }
    }

