package Marcella.Zoo;

public class Food {

    private String name;
    private String amount;
    private int dailyAmount;

    public Food(String name, String amount){
        this.name = name;
        this.amount = amount;
        dailyAmount = 0;
    }

    public void addDailyAmount(int amount){
        dailyAmount += amount;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void printStructure(String prefix){
        System.out.printf("%s%s %d %s%n", prefix, name, dailyAmount, amount);
    }

}
