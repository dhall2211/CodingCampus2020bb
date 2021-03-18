package Bokhee.FileIO.DTO;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class AverageCumulativeDTO implements Comparable {
    private final String country;
    private final List<Double> cumulatives;
    private double cumulativeAverage;

    public AverageCumulativeDTO(String country) {
        this.country = country;
        this.cumulatives = new LinkedList<>();
    }

    public static Collection<String[]> convert(Collection<AverageCumulativeDTO> data) {
        Collection<String[]> result = new LinkedList<>();
        for (var line : data) {
            result.add(new String[]{line.getCountry(), String.valueOf(line.getCumulativeAverage())});
        }
        return result;
    }

    private String getCountry() {
        return country;
    }

    public double getCumulativeAverage() {
        return cumulativeAverage;
    }

    public void addCumulativeValue(double cumulative) {
        if (cumulative > 0) {
            this.cumulatives.add(cumulative);
            cumulativeAverage = getCumulativesSum() / cumulatives.size();
        }
    }

    private double getCumulativesSum() {
        double sum = 0;
        for (var cumulative : cumulatives) {
            sum += cumulative;
        }
        return sum;
    }

    @Override
    public int compareTo(Object o) {
        return (int) (((AverageCumulativeDTO) o).getCumulativeAverage() * 1000 - cumulativeAverage * 1000);
    }
}
