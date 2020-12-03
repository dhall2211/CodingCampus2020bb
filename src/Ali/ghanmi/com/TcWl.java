package Ali.ghanmi.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TcWl {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] tabel = SimpleCSVReader.readCSV("C:\\Users\\DCV\\Downloads\\TC_WL.csv", ",");
        String[][] matTabel = SimpleCSVReader.readCSV("C:\\Users\\DCV\\Downloads\\Material_index.csv", ",");
        int[] indexInput = indexOfRow(tabel);
        System.out.println(Arrays.toString(indexInput));
        int[] indexInputDesign = indexOfCulom(tabel);
        System.out.println(Arrays.toString(indexInputDesign));


        int[] tcref = new int[2];
        tcref[0] = indexInput[0];
        tcref[1] = indexInputDesign[1];
        // materialIndex(matTabel);

        System.out.println(Arrays.toString(tcref));

        System.out.println(tabel[34][3]);
        double matin = Double.parseDouble(matTabel[1][1]);
       // int [] matinedex=getUserMatInput(sc,matTabel);
      //  System.out.println(Arrays.toString(matinedex));
        // System.out.println(mat);
        // System.out.println(mat);


        // getmat(matTabel);


    }





    public static int[] indexOfRow(String[][] ar) { //this function will find x in 2D array ar(with dimension of row*col) and return the index
        int[] index = new int[2];
        System.out.println("Stärke Eingeben");
        String input = sc.nextLine();
        index[0] = index[1] = -1;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j].equals(input)) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    public static int[] indexOfCulom(String[][] ar) { //this function will find x in 2D array ar(with dimension of row*col) and return the index
        int[] index = new int[2];
        System.out.println(getScannerInput(" S = Sphärisch\n D = TD\n P = TP\n B = Benden"));
        String input = sc.nextLine();
        index[0] = index[1] = -1;
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j].equals(input)) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }


    public static double getUserMatInput(Scanner sc, String[][] arr) {

        int[] indexMaterial = new int[1];
        System.out.println("Material Auswahl: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(j + ": " + arr[j]);

        }
        while (true) {
            if (sc.hasNextInt()) {
                int userInput = sc.nextInt();
                if (userInput >= 0 && userInput < arr.length) {
                    return Double.parseDouble(arr[userInput][1]);

                }


            } else {
                sc.next();
            }
        }

    }

    private static int getScannerInput(String text) {
        while (true) {
            System.out.println();
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        }

    }}