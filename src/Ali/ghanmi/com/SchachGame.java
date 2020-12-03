package Ali.ghanmi.com;

import java.util.Random;

public class SchachGame {
    //private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    private static int[][] possibleSteps = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, -1}, {-1, -2}};

    public static void main(String[] args) {
        int[][] field = new int[8][8];
        int[] pos = {7, 0};
        printField(field, pos);
        // getrandomposition(possibleSteps);
        //// movePosition(field, currentPosition);
        // System.out.println(currentPosition);

        while (!zielEreichet(pos)) {
            System.out.println();
            movePosition(field, pos);
            printField(field, pos);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie) { /* Ignore */ }
        }
    }


    private static boolean zielEreichet(int[] actulPos) {
        if ((actulPos[0] == 0) && (actulPos[1] == 7))
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
/*
    private static int[] getrandomposition(int[][] possibleSteps) {
        return possibleSteps[random.nextInt(8)];
    }

 */

/*
    private static char[][] initArray(int rows, int columns) {
        char[][] arr = new char[rows][columns];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = '.';
            }
        }
        return arr;
    }
*/

    public static void printField(int[][] arr, int[] actulPos) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (row == actulPos[0] && column == actulPos[1]) {
                    System.out.print("O");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println(" ");

        }
    }
}


        /*


        private static boolean checkGameOver ( char[][] arr, int pos){
            if (pos == arr[0][7]) {

                return false;
            }
        }
    }
}

            public static boolean isBorderReached(char[][]arr, int pos) {//grenze kontrolieren funktion
        if()
                return (pos == 1) || (pos == width);
            }
        }
    }
}

         */
