package Ali.ghanmi.com;

import java.util.Scanner;

public class DoWheilSchleine {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numbers = (int) (Math.random() * 10 + 1);
        int guess;

        while (true) {
            do {
                System.out.println("Deine zahl eingeben.....");
                guess = userInputInt(50, 1);
                if (guess == numbers) {
                    System.out.println("Gut");
                } else if (guess < numbers) {
                    System.out.println("zu klein");
                } else if
                (guess > numbers) {

                    System.out.println("zu gross");

                }


            } while (guess != numbers);

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

/*
    public static boolean isCorrect(int max, int min) {
        boolean isCorrectTyping = false;
        int input=0;
        if (input < min + 1 && input > max || input != 0) {
            System.out.println("OUT OF RANGE");
            isCorrectTyping = true;
        }
        return isCorrectTyping;
    }
}
*/
