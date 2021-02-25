package Ali.ghanmi.com.FileIO.DTO;

import java.util.Collection;
import java.util.LinkedList;

public class MaxCumulativeDTO implements Comparable {
    private final String country;
    private double maxCumulative;

    public MaxCumulativeDTO(String country) {
        this.country = country;
    }

    public static Collection<String[]> convert(Collection<MaxCumulativeDTO> data) {
        Collection<String[]> result = new LinkedList<>();
        for (var line : data) {
            result.add(new String[]{line.getCountry(), String.valueOf(line.getMaxCumulative())});
        }
        return result;
    }

    public String getCountry() {
        return country;
    }

    public void addMaxCumulative(double cumulative) {
        if (cumulative > maxCumulative) {
            maxCumulative = cumulative;
        }
    }

    public double getMaxCumulative() {
        return maxCumulative;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (((MaxCumulativeDTO) o).getMaxCumulative() * 1000 - maxCumulative * 1000);
    }
}
