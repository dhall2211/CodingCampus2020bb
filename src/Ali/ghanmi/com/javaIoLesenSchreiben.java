package Ali.ghanmi.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class javaIoLesenSchreiben {
    public static void main(String[] args) {

        try {
            File covid = new File("C:\\Users\\DCV\\covid19.csv");
            Scanner myReader = new Scanner(covid);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
    /*
    private static String[][] sortedString(String[][] covidTopList) {

        String[][] covidTopList = SimpleCSVReader.readCSV("C:\\Users\\DCV\\covid19.csv");
        for (int i = 1; i < copy.length; i++) {
            for (int j = 2; j < copy.length - 1; j++)

                if (parseInt(copy[i][2]) > parseInt(copy[j][2])) {
                    String[] temp = copy[i];
                    copy[i] = copy[j];
                    copy[j] = temp;
}

     */
