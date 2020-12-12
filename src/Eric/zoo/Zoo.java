package Eric.zoo;

import Eric.zoo.animals.Animal;
import Eric.zoo.compounds.Compound;
import Eric.zoo.data.InMemoryFoodlist;
import Eric.zoo.food.Food;
//import Eric.zoo.data.InMemoryFoodlist;

import java.util.ArrayList;
import java.util.List;
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

    public void printFoodlist(List<Animal> animals) {

        List<Food> foodTotal = animals.stream().collect(Collectors.mapping(a -> a.getFood(), Collectors.toList()));
        var foodList = InMemoryFoodlist.foodlist.entrySet();

        System.out.println("NEEDED FOOD");

        for (var food : foodList) {
            var res = 0.0;
            var unit = (food.getValue().getUnit() == null) ? "" : food.getValue().getUnit();
            var name = food.getValue().getName();
            for (Food f : foodTotal) {
                if (f.getName().equals(food.getValue().getName())) {
                    res += f.getQuantity();
                }
            }
            System.out.println(name + " ------------- " + res + " " + unit);
        }
    }
}

