package Daniel.Util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CollectionUtil {
    public static <T> String getCollectionAsString(Collection<T> values, String separator){
        String output = "";
        for (T value : values) {
            output += value.toString() + separator;
        }
        output = output.substring(0, output.length()-separator.length());
        return output;
    }

    public static <T> void printCollection(Collection<T> values, String separator){
        System.out.println(CollectionUtil.getCollectionAsString(values, separator));;
    }

    public static void main(String[] args){
        List<String> strings = new LinkedList<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        CollectionUtil.printCollection(strings, " - ");
    }
}
