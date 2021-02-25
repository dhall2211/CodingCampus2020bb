package Ali.ghanmi.com.covisStatistic;

//import Ali.ghanmi.com.FileIO.DailyCovidDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var csv = CsvUtil.loadCsv(Paths.get("C:\\Users\\DCV\\covid19.csv"),",");
        var data = DailyCases.convert(csv);

    }

}
