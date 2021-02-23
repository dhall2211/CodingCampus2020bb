package Ali.ghanmi.com.FileIO;

import java.util.*;

public class CovidAggregator {
    public Collection<CovidAggregationDTO> getTopCases(Collection<DailyCovidDTO> data) {
        Map<String, CovidAggregationDTO> resultSet = new HashMap<>();
        for (var item : data) {
            var aggregationData = resultSet.get(item.getCountry());
            if (aggregationData == null) {
                aggregationData = new CovidAggregationDTO(item.getCountry());
                resultSet.put(item.getCountry(), aggregationData);
            }
            aggregationData.addCases(Integer.parseInt(item.getCases()));
        }
        List<CovidAggregationDTO> sorted = new LinkedList<>(resultSet.values());
        Collections.sort(sorted, new SortByCasesDesc());
        return sorted;
    }

    class SortByCasesDesc implements Comparator<CovidAggregationDTO> {
        @Override
        public int compare(CovidAggregationDTO o1, CovidAggregationDTO o2) {
            return o2.getCases() - o1.getCases();
        }
    }
}
