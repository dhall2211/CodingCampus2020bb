package Ali.ghanmi.com.Util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtil {

    /**
     * Transforms a collection of any type into a string of the values, separated by given separator.
     * @param values collection of values
     * @param separator separator
     * @param <T> type of values - needs to implement toString()
     * @return collection as string
     */
    public static <T> String getCollectionAsString(Collection<T> values, String separator){
        String output = "";
        for (T value : values) {
            output += value.toString() + separator;
        }
        output = output.substring(0, output.length()-separator.length());
        return output;
    }

    /**
     * Prints a collection of any type to the console, separated by given separator.
     * @param values collection of values
     * @param separator separator
     * @param <T> type of values - needs to implement toString()
     */
    public static <T> void printCollection(Collection<T> values, String separator){
        System.out.println(CollectionUtil.getCollectionAsString(values, separator));;
    }

    public static void main(String[] args){
        List<String> strings = new LinkedList<>();
        strings.add("hey");
        strings.add("hi");
        strings.add("ho");
        CollectionUtil.printCollection(strings, " - ");

        List<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        CollectionUtil.printCollection(integers, " .. ");
    }
}
