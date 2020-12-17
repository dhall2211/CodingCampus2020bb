package Eric._zoo_simulation;

public class View {

    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";

    public void printGreeting(String name){
        System.out.println("Welcome to " + name.toUpperCase());
        System.out.println("-------------------------------------");
        System.out.println("Enjoy our exotic animals:");
    }

    public void printResult(int days, Double budget){
        System.out.println("-------------------------------------");
        System.out.println("After " + days + " Days Budget is: " + Math.round(budget));
        System.out.println("-------------------------------------");
    }

    public void printDay(int dayCount){
        System.out.println();
        System.out.println("DAY: " + ( 1 + dayCount));
    }

    public void printDailyBudget(Double budget){
        System.out.println("Budget: " + budget);
    }

    public void printFoodCost(Double foodCost){
        System.out.println(RED + "Costs for food: " + foodCost + RESET);
    }

    public void printIncome(Double income, int tickets){
        System.out.println(GREEN + tickets + " tickets sold. Daily Income " + income + RESET);
    }

    public void printGameOver() {
        System.out.println(RED + "you are out of money. zoo has to close!");
    }

    public void printSuccess(int win){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(GREEN + "Well done! you made a win of " + win + RESET);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}
