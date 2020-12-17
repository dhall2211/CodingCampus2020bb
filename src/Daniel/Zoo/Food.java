package Daniel.Zoo;

public class Food {
    private String name;
    private String unit;
    private int dailyAmount;
    private int amount;

    public Food(String name, String unit){
        this.name = name;
        this.unit = unit;
        dailyAmount = 0;
    }

    public Food(String name, String unit, int amount) {
        this(name, unit);
        this.amount = amount;
    }

    public void addDailyDemand(int demand){
        this.dailyAmount += demand;
        this.amount += demand;
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s %d %s%n", prefix, name, dailyAmount, unit);
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Food getDemand(int amount) {
        this.amount -= amount;
        return new Food(name, unit, amount);
    }

    public void checkStock() {
        if(amount < dailyAmount * 3){
            // order new food
            amount += dailyAmount*7;
            System.out.println(dailyAmount*7 + unit + " " + name + " bestellt.");
        }
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + unit + " " + name;
    }
}
