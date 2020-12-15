package Eric.zoo;

import Eric.zoo.animals.Animal;
import Eric.zoo.compounds.Compound;
import Eric.zoo.compounds.LionCompound;
import Eric.zoo.compounds.SnakeCompound;
import Eric.zoo.data.InMemoryAnimalList;
import Eric.zoo.data.InMemoryFoodlist;
import Eric.zoo.data.InMemoryPricelist;
import Eric.zoo.food.Food;
import Eric.zoo.keeper.Keeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ZooController {

    private final Double ticktet = 12.0;
    public static Double budget;
    public static List<Compound> compounds = new ArrayList<>();

    private String name;
    private Keeper keeper;
    private Veterinarian vet;
    private InMemoryAnimalList animals;
    private View view = new View();

    public ZooController() {
        initialize();
    }

    public ZooController(String name) {
        this.name = name;
    }

    public void simulate(int days, Double budgetTotal) throws InterruptedException {
        var startBudget = budgetTotal;
        budget = budgetTotal;
        view.printGreeting(name);
        this.getAnimals().printAllAnimals();

        for (int i = 0; i < days; i++) {
            Thread.sleep(2000);
            if (!simulateDay(i)) {
                return;
            }
        }
        var win = (int) (budget - startBudget);
        if ((win < 0)) {
            view.printResult(days, budget);
        } else {
            view.printSuccess(win);
        }
    }

    private boolean simulateDay(int dayCount) throws InterruptedException {
        int quality = 0;
        var random = new Random();
        var animalList = animals.getAllAnimals();
        animalList.forEach(a -> a.setHealth(10));

        view.printDay(dayCount);
        Thread.sleep(1000);
        view.printDailyBudget((double) Math.round(budget));

        for (Animal animal : animalList) {
            Thread.sleep(1000);
            var health = random.nextInt(10);
            animal.setHealth(health);
            quality += health;
        }

        var foodCost = getFoodBudgetPerDay();
        budget -= foodCost;
        view.printFoodCost(foodCost);

        var income = incomeByVisitors(quality);
        budget = budget + income;
        var tickets = (int) (income / ticktet);
        view.printIncome(income, tickets);

        if (budget < foodCost) {
            view.printGameOver();
            return false;
        }
        return true;
    }

    private Double incomeByVisitors(int quality) {
        var random = new Random();
        var visitors = Double.valueOf(random.nextInt(1000) + quality * 10);
        return visitors * ticktet;
    }

    private Double getFoodBudgetPerDay() {
        var budget = 0.0;

        var foodTotal = animals.getAllAnimals().stream().map(Animal::getFood).collect(Collectors.toList());
        var prices = InMemoryPricelist.prices;

        for (var food : foodTotal) {
            var quantity = food.getQuantity();
            var price = prices.get(food.getName());
            budget += (price * quantity);
        }
        return budget;
    }

    private void initialize() {
        this.name = "GreenDreams";
        this.animals = new InMemoryAnimalList();
        InMemoryPricelist prices = new InMemoryPricelist();

        var lions = animals.getAnimalsBySpecies("Lion");
        var snakes = animals.getAnimalsBySpecies("Snake");

        LionCompound lionCompound = new LionCompound("Lions", lions);
        SnakeCompound snakeCompound = new SnakeCompound("Snakes", snakes);

        List<Compound> compounds = new ArrayList<>();
        compounds.add(lionCompound);
        compounds.add(snakeCompound);

        this.keeper = new Keeper("WildBill", compounds);
        this.vet = new Veterinarian("Doolittle", animals.getAllAnimals());
    }

    public void printStructure() {
        System.out.println("Welcome in " + this.name + " -> Our Compounds: ");
        for (Compound compound : compounds) {
            System.out.println(compound.toString());
        }
    }

    public void printFoodlist(List<Animal> animals) {

        List<Food> foodTotal = animals.stream().map(Animal::getFood).collect(Collectors.toList());
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

    public static Double getBudget() {
        return budget;
    }

    public static void setBudget(Double budget) {
        ZooController.budget = budget;
    }

    public static List<Compound> getCompounds() {
        return compounds;
    }

    public static void setCompounds(List<Compound> compounds) {
        ZooController.compounds = compounds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keeper getKeeper() {
        return keeper;
    }

    public void setKeeper(Keeper keeper) {
        this.keeper = keeper;
    }

    public Veterinarian getVet() {
        return vet;
    }

    public void setVet(Veterinarian vet) {
        this.vet = vet;
    }

    public InMemoryAnimalList getAnimals() {
        return animals;
    }

    public void setAnimals(InMemoryAnimalList animals) {
        this.animals = animals;
    }
}

