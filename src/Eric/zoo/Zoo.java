package Eric.zoo;

import Eric.zoo.compounds.Compound;
import Eric.zoo.data.InMemoryFoodlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    private String name;
    public static List<Compound> compounds = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public void printStructure() {
        System.out.println("Welcome in " + this.name + " -> Our Compounds: ");
        for (Compound compound : compounds) {
            System.out.println(compound.toString());
        }
    }

    public void printFoodlist() {

        var map = InMemoryFoodlist.foodlist;

        var groups = map.values().stream().
                collect(Collectors.groupingBy(a -> a.getName() + "#" + a.getQuantity() + "#" + a.getUnit(),
                        Collectors.counting()));

        var entries = groups.entrySet();

        System.out.println("needed food");

        for (Map.Entry<String, Long> entry : entries) {
            var food = entry.getKey().split("#")[0];
            var quantity = Double.parseDouble(entry.getKey().split("#")[1]);
            var unit = (entry.getKey().split("#")[2].equals("null")) ? "" : entry.getKey().split("#")[2];
            System.out.println(food + " : " + entry.getValue() * quantity + " " + unit);
        }
    }
}
