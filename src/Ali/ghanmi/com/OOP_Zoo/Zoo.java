package Ali.ghanmi.com.OOP_Zoo;

import java.util.Vector;

public class Zoo {
    private String name;
    private Vector<EnclosurePark> enclosureParks;
    private Vector<FoodAnimal> foodManagment;//

    public Zoo(String name) {
        this.name = name;

        this.enclosureParks = new Vector<>();
        this.foodManagment = new Vector<>();//
    }

    public void addFood(FoodAnimal food) {//
        foodManagment.add(food);
    }

    public void addEnclosure(EnclosurePark sector) {
        enclosureParks.add(sector);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Regional: " + name;
    }

    public void printStructure(String prefix) {
        System.out.println(prefix + name);
        for (int i = 0; i < enclosureParks.size(); i++) {
            enclosureParks.get(i).printStructure(prefix + "   ");

        }
    }
}