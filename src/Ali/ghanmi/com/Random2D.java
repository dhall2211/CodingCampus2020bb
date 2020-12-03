package Ali.ghanmi.com;

import java.util.Arrays;
import java.util.Random;

public class Random2D {
    public static void main(String[] args){
        int[][] randomNumbers = new int[7][7];
        createRandomInt(randomNumbers);
        for (int row = 0; row < randomNumbers.length; row++){
            System.out.println(Arrays.toString(randomNumbers[row]));
        }
        int[] result = calculateRows(randomNumbers);
        System.out.println(Arrays.toString(result));
    }

    private static void createRandomInt(int[][] randomNumbers) {
        Random random = new Random();
        for (int row = 0; row < randomNumbers.length; row++){
            for (int column = 0; column < randomNumbers[row].length; column++){
                randomNumbers[row][column] = random.nextInt(20);
            }
        }
    }

    private static int[] calculateRows(int[][] randomNumbers) {
        int[] results = new int[randomNumbers.length];
        for (int row = 0; row < randomNumbers.length; row++){
            int sum = 0;
            for (int column = 0; column < randomNumbers[row].length; column++){
                sum += randomNumbers[row][column];
            }
            results[row] = sum;
        }
        return results;
    }
}
