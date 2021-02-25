package Ali.ghanmi.com.FileIO;

import Ali.ghanmi.com.FileIO.DTO.*;
import Daniel.Logging.LogType;
import Daniel.Logging.SimpleLogger;

import java.util.*;

public class CovidAggregator {
    public Collection<TopCasesDTO> getTopCases(Collection<DailyCovidDTO> data) {
        Map<String, TopCasesDTO> resultSet = new HashMap<>();
        for (var item : data) {
            var aggregationData = resultSet.get(item.getCountry());
            if (aggregationData == null) {
                aggregationData = new TopCasesDTO(item.getCountry());
                resultSet.put(item.getCountry(), aggregationData);
            }
            aggregationData.addCases(Integer.parseInt(item.getCases()));
        }
        List<TopCasesDTO> sorted = new LinkedList<>(resultSet.values());
        Collections.sort(sorted);
        return sorted;
    }

    public Collection<AverageCumulativeDTO> getAverageCumulative(Collection<DailyCovidDTO> data) {
        Map<String, AverageCumulativeDTO> resultSet = new HashMap<>();
        for (var item : data) {
            var aggregationData = resultSet.get(item.getCountry());
            if (aggregationData == null) {
                aggregationData = new AverageCumulativeDTO(item.getCountry());
                resultSet.put(item.getCountry(), aggregationData);
            }
            if (item.getCumulativeCases() != null) {
                aggregationData.addCumulativeValue(Double.parseDouble(item.getCumulativeCases()));
            }
        }
        List<AverageCumulativeDTO> sorted = new LinkedList<>(resultSet.values());
        Collections.sort(sorted);
        return sorted;
    }

    public Collection<MaxCumulativeDTO> getMaxCumulative(Collection<DailyCovidDTO> data) {
        Map<String, MaxCumulativeDTO> resultSet = new HashMap<>();
        for (var item : data) {
            var aggregationData = resultSet.get(item.getCountry());
            if (aggregationData == null) {
                aggregationData = new MaxCumulativeDTO(item.getCountry());
                resultSet.put(item.getCountry(), aggregationData);
            }
            if (item.getCumulativeCases() != null) {
                aggregationData.addMaxCumulative(Double.parseDouble(item.getCumulativeCases()));
            }
        }
        List<MaxCumulativeDTO> sorted = new LinkedList<>(resultSet.values());
        Collections.sort(sorted);
        return sorted;
    }

    public Collection<TopPercentagePopulationDTO> getTopPercentagePopulation(Collection<DailyCovidDTO> data) {
        Map<String, TopPercentagePopulationDTO> resultSet = new HashMap<>();
        for (var item : data) {
            var aggregationData = resultSet.get(item.getCountry());
            if (aggregationData == null) {
                if (item.getPopulation() == null || item.getPopulation() == "") {
                    SimpleLogger.getInstance().log(LogType.WARNING, item.getCountry() + " has empty population column");
                    continue;
                }
                aggregationData = new TopPercentagePopulationDTO(item.getCountry(), Integer.parseInt(item.getPopulation()));
                resultSet.put(item.getCountry(), aggregationData);
            }
            aggregationData.addCases(Integer.parseInt(item.getCases()));
        }
        List<TopPercentagePopulationDTO> sorted = new LinkedList<>(resultSet.values());
        Collections.sort(sorted);
        return sorted;
    }
}
