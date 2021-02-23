package Ali.ghanmi.com.FileIO;

import Daniel.Logging.LogType;
import Daniel.Logging.SimpleLogger;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        var basePath = Paths.get(System.getProperty("user.dir"), "src/Daniel/FileIO");

        var csv = CsvUtil.loadCsv(basePath.resolve("covid19.csv"), ",");

        var data = DailyCovidDTO.convert(csv);
        var aggregator = new CovidAggregator();
        var topList = aggregator.getTopCases(data);

        CsvUtil.saveCsv(basePath.resolve("covid-toplist.csv"), CovidAggregationDTO.convert(topList), ";");

        long finish = System.currentTimeMillis();
        SimpleLogger.getInstance().log(LogType.INFO, "processed " + csv.size() + " lines in " + (finish - start) + "ms");
    }
}
