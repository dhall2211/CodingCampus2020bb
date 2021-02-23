package Daniel.FileIO.DTO;

import java.util.Collection;
import java.util.LinkedList;

public class TopPercentagePopulationDTO implements Comparable {
    private final String country;
    private final int population;
    private int cases;

    public TopPercentagePopulationDTO(String country, int population) {
        this.country = country;
        this.cases = 0;
        this.population = population;
    }

    public static Collection<String[]> convert(Collection<TopPercentagePopulationDTO> data) {
        Collection<String[]> result = new LinkedList<>();
        for (var line : data) {
            result.add(new String[]{line.getCountry(), String.valueOf(line.getPercentage())});
        }
        return result;
    }

    private String getCountry() {
        return country;
    }

    public void addCases(int cases) {
        this.cases += cases;
    }

    public double getPercentage() {
        return (double) cases / (double) population * 100;
    }

    @Override
    public int compareTo(Object o) {
        var that = ((TopPercentagePopulationDTO) o);
        if (this.getPercentage() < that.getPercentage()) {
            return 1;
        } else if (this.getPercentage() > that.getPercentage()) {
            return -1;
        } else {
            return 0;
        }
    }
}
