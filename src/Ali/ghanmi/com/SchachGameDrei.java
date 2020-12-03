package Ali.ghanmi.com;

import java.util.Arrays;
import java.util.Random;

public class SchachGameDrei {
    //private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static int[][] possibleSteps = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, -1}, {-1, -2}};

    public static void main(String[] args) {
        int[][] field = new int[8][8];
        int[] pos = {7, 0};
        int[] pos2 = {0, 7};


        while (!zielEreichet(pos,pos2)) {
            System.out.println();
            movePosition(field, pos);
            movePosition(field, pos2);
            printField(field, pos, pos2);
            System.out.println(Arrays.toString(pos));
            System.out.println(Arrays.toString(pos2));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) { /* Ignore */ }
        }
    }
    private static boolean zielEreichet(int[] actulPos, int [] actulPos2) {
        if ((actulPos[0] == actulPos2[0]) && (actulPos[1] == actulPos2[1]))
            return true;
        return false;
    }
    public static void movePosition(int[][] arr, int[] actulPos) {
        boolean stepOK = false;
        int[] test = new int[2];
        while (!stepOK) {
            int[] nextMove = possibleSteps[random.nextInt(8)];
            int maxLengt = arr.length;
            test[0] = actulPos[0] + nextMove[0];
            test[1] = actulPos[1] + nextMove[1];
            if (test[0] >= 0 && test[1] >= 0 && test[0] <= 7 && test[1] <= 7) {
                actulPos[0] = test[0];
                actulPos[1] = test[1];
                stepOK = true;
            }
        }
    }
    public static void printField(int[][] arr, int[] actulPos, int[] actulPos2) {
        char c1 = 'X';
        char c2 = 'O';
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (row == actulPos2[0] && column == actulPos2[1]) {
                    System.out.print(c2);
                }else if (row == actulPos[0] && column == actulPos[1]){
                    System.out.print(c1);

                } else {
                    System.out.print(".");
                }
            }
            System.out.println(" ");
        }
    }

    public static void movePosition2(int[][] arr, int[] actuelpos2) {
        boolean stepOK = false;
        int[] test = new int[2];
        while (!stepOK) {
            int[] nextMove = possibleSteps[random.nextInt(8)];
            int maxLengt = arr.length;
            test[0] = actuelpos2[0] + nextMove[0];
            test[1] = actuelpos2[1] + nextMove[1];
            if (test[0] >= 0 && test[1] >= 0 && test[0] <= 7 && test[1] <= 7) {
                actuelpos2[0] = test[0];
                actuelpos2[1] = test[1];
                stepOK = true;
            }
        }
    }
}