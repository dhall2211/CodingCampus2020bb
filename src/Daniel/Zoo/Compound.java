package Daniel.Zoo;

import java.util.Vector;

public class Compound {
    private String name;
    private Vector<Animal> animalList;

    public Compound(String name){
        this.name = name;
        animalList = new Vector<>();
    }



    public void addTier(Animal t){
        if (!animalList.contains(t)){
            animalList.add(t);
        }
    }

    public void printStruktur(String prefix){
        System.out.println(prefix + name);
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).printStruktur(prefix + "  ");
        }
    }

    public String getName() {
        return name;
    }

    /**
     * Get food demand of (all animals in) compound.
     * @return
     */
    public Vector<Demand> getDemands() {
        var demands = new Vector<Demand>();
        for (var animal : animalList) {
            demands.add(animal.getDemand());
        }
        return demands;
    }

    public void feedAnimals(Vector<Food> foods) {
        for (var animal : animalList) {
            var demand = animal.getDemand();
            Food foodToFeed = null;
            for (var food : foods) {
                if(food.getName().equals(demand.getFood().getName()) && food.getAmount() == demand.getAmount()){
                    foodToFeed = food;
                    break;
                }
            }
            foods.remove(foodToFeed);
            System.out.println("Tier " + animal.getName() + " gefüttert mit " + foodToFeed);
        }
    }
}
