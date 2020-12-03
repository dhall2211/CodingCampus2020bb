package Ali.ghanmi.com;

import java.util.Random;
import java.util.Scanner;

public class ZufallzahlRaten {
    private static Random rand = new Random();
    private static Scanner sc = new Scanner(System.in);

  //  public static void guessNumber() {

    public static void main(String[] arg) {
        /* Write a program that generates a random number between 1 and 50. The user can guess the
         * number ten times and the program tells if he has to guess higher or lower.
         * The user won the game if he guesses the nmber
         */

        int RANDOM = rand.nextInt(50) + 1;
        boolean isPlaying = true;
        int round = 1;

        while (isPlaying) {
            System.out.println("Round " + round + ". Enter your guess");
            int guess = userInputInt(1, 50);

            if (guess == RANDOM) {
                System.out.println("You won");
                isPlaying = false;
            } else if (round == 10) {
                System.out.println("You lost");
                isPlaying = false;
            } else if (guess < RANDOM) {
                System.out.println("Higher");
            } else if (guess > RANDOM) {
                System.out.println("Lower");
            }

            round++;
            System.out.println();
        }
    }

    public static int userInputInt(int min, int max) {
        int intInput = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                String line = sc.nextLine();
                intInput = Integer.valueOf(line.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Not a valid input. Try again.");
                continue;
            }

            if (intInput >= 1 && intInput <= 50) {
                isValidInput = true;
            } else {
                System.out.println("Not within game range (between " + min + " and " + max + "). Try again");
            }
        }
        return intInput;
    }
}