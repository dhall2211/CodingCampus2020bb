package Bokhee.FileIO.DTO;

import java.util.Collection;
import java.util.LinkedList;

// DTO = data transfer object
public class DailyCovidDTO {
    private final String cases;
    private final String country;
    private final String popData2019;
    private String cumulativeCases;

    public DailyCovidDTO(String[] csvLine) {
        this.cases = csvLine[4];
        this.country = csvLine[6];
        this.popData2019 = csvLine[9];
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

    public String getPopulation() {
        return popData2019;
    }
}
