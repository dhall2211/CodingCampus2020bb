package Ali.ghanmi.com;

import java.util.Arrays;
import java.util.Random;

class Day27_2111_Chess {
    private static Random random = new Random();


    public static void main(String[] args) {
        int boardSize = 8;
        int[] pos = {7, 0}; // Feld A1
        printChessTable(pos, boardSize);
        while (!checkEndGame(pos)) {
            System.out.println();
            makeAMove(pos);
            printChessTable(pos, boardSize);
            try { Thread.sleep(500); } catch (InterruptedException ie) { /* Ignore */ }
        }
    }

    public static void printChessTable(int[] knightPos, int boardSize) {
        for (int rowX = 0; rowX < boardSize; rowX++) {
            for (int columnY = 0; columnY < boardSize; columnY++) {
//                if( (rowX+columnY) % 2 == 0){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
                if (knightPos[0] == rowX && knightPos[1] == columnY) {
                    System.out.print("K");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

    public static void makeAMove(int[] knightPos) {
        // A1 --> C2 --> B4 --> A2
        boolean validMove = false;
        int[] testPos = {-1,-1};
        while (!validMove) {
            int randomMove = random.nextInt(8);
            switch (randomMove) {
                case 0:
                    testPos[0] = knightPos[0] + 1;
                    testPos[1] = knightPos[1] - 2;
                    break;
                case 1:
                    testPos[0] = knightPos[0] + 1;
                    testPos[1] = knightPos[1] + 2;
                    break;
                case 2:
                    testPos[0] = knightPos[0] - 1;
                    testPos[1] = knightPos[1] - 2;
                    break;
                case 3:
                    testPos[0] = knightPos[0] - 1;
                    testPos[1] = knightPos[1] + 2;
                    break;
                case 4:
                    testPos[0] = knightPos[0] + 2;
                    testPos[1] = knightPos[1] - 1;
                    break;
                case 5:
                    testPos[0] = knightPos[0] + 2;
                    testPos[1] = knightPos[1] + 1;
                    break;
                case 6:
                    testPos[0] = knightPos[0] - 2;
                    testPos[1] = knightPos[1] - 1;
                    break;
                case 7:
                    testPos[0] = knightPos[0] - 2;
                    testPos[1] = knightPos[1] + 1;
                    break;
                default:
                    System.out.println("Random move is not defined correctly.");
            }
            if (testPos[0] >= 0 && testPos[1] >= 0 && testPos[0] <= 7 && testPos[1] <= 7) {
                knightPos[0] = testPos[0];
                knightPos[1] = testPos[1];
                validMove = true;
            }
        }
        //return knightPos;
    }

    public static boolean checkEndGame(int[] knightPos) {
        if ((knightPos[0] == 0) && (knightPos[1] == 7)) return true;
        return false;
    }
}
