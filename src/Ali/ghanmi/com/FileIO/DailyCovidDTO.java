package Ali.ghanmi.com.FileIO;

import java.util.Collection;
import java.util.LinkedList;

// DTO = data transfer object
public class DailyCovidDTO {
    private final String date;
    private final String day;
    private final String month;
    private final String year;
    private final String cases;
    private final String deaths;
    private final String country;
    private final String countryIsoCode;
    private final String countryTerritoryCode;
    private final String popData2019;
    private final String continent;
    private String cumulativeCases;

    public DailyCovidDTO(String[] csvLine) {
        this.date = csvLine[0];
        this.day = csvLine[1];
        this.month = csvLine[2];
        this.year = csvLine[3];
        this.cases = csvLine[4];
        this.deaths = csvLine[5];
        this.country = csvLine[6];
        this.countryIsoCode = csvLine[7];
        this.countryTerritoryCode = csvLine[8];
        this.popData2019 = csvLine[9];
        this.continent = csvLine[10];
        if (csvLine.length >= 12) {
            this.cumulativeCases = csvLine[11];
        }
    }

    public static Collection<DailyCovidDTO> convert(Collection<String[]> csv) {
        Collection<DailyCovidDTO> data = new LinkedList<>();
        for (String[] line : csv) {
            data.add(new DailyCovidDTO(line));
        }
        return data;
    }

    public String getCases() {
        return cases;
    }

    public String getCountry() {
        return country;
    }

    public String getCumulativeCases() {
        return cumulativeCases;
    }
}
