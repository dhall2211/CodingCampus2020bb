package Ali.ghanmi.com;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe2 {
    public static void main(String[] args) {
        boolean gameOver = false;
        char[][] field = new char[3][3];
        int player = 1;
        while (!gameOver) {
            nextTurn(field, player);
            gameOver = checkGameOver(field, player);
            printField(field);
            player = togglePlayer(player);
        }
    }

    private static boolean checkGameOver(char[][] field, int player) {
        // check columns and rows
        for (int i = 0; i < 3; i++) {
            if ((field[0][i] != 0 && field[0][i] == field[1][i] && field[1][i] == field[2][i]) ||
                    (field[i][0] != 0 && field[i][0] == field[i][1] && field[i][1] == field[i][2])) {
                printWinMessage(player);
                return true;
            }
        }

        // check diagonals
        if (field[0][0] != 0 && field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
            printWinMessage(player);
            return true;
        }
        if (field[0][2] != 0 && field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
            printWinMessage(player);
            return true;
        }

        // check no empty fields left
        for (char[] row : field) {
            for (char element : row) {
                if (element == 0) {
                    return false;
                }
            }
        }
        System.err.println("Spielfeld voll!");
        return true;
    }
//Spielfeldprint
    private static void printWinMessage(int player) {

        System.out.println("Spieler " + player + " gewinnt!");
    }

    private static void printField(char[][] field) {
        for (int row = 0; row < field.length; row++) {
            System.out.println(Arrays.toString(field[row]));
        }
    }

    private static void nextTurn(char[][] field, int player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Spieler " + player + " ist an der Reihe.");
        boolean fieldNotEmpty = true;
        int row = 0;
        int column = 0;
        while (fieldNotEmpty) {
            row = getUserInput(scanner, "Reihe");
            column = getUserInput(scanner, "Spalte");

            fieldNotEmpty = field[row - 1][column - 1] != 0;
            if (fieldNotEmpty) {
                System.err.println("Spielfeld bereits belegt!");
            }
        }
        field[row - 1][column - 1] = getPlayersCharacter(player);
    }

    private static int getUserInput(Scanner scanner, String type) {
        int input = 0;
        while (input <= 0 || input > 3) {
            System.out.println("Bitte geben sie die " + type + " an (1-3):");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                scanner.next(); // empty scanner again
            }
        }
        return input;
    }

    private static char getPlayersCharacter(int player) {
        if (player == 1) {
            return 'X';
        }
        return 'O';
    }

    private static int togglePlayer(int player) {
        if (player == 1) {
            return 2;
        }
        return 1;
    }
}
