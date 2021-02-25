package Ali.ghanmi.com.FileIO.DTO;

import java.util.Collection;
import java.util.LinkedList;

// DTO = data transfer object
public class TopCasesDTO implements Comparable {
    private final String country;
    private int cases;

    public TopCasesDTO(String country) {
        this.country = country;
        this.cases = 0;
    }

    public static Collection<String[]> convert(Collection<TopCasesDTO> data) {
        Collection<String[]> result = new LinkedList<>();
        for (var line : data) {
            result.add(new String[]{line.getCountry(), String.valueOf(line.getCases())});
        }
        return result;
    }

    public int getCases() {
        return cases;
    }

    public String getCountry() {
        return country;
    }

    public void addCases(int cases) {
        this.cases += cases;
    }

    @Override
    public int compareTo(Object o) {
        return ((TopCasesDTO) o).getCases() - this.getCases();
    }
}
