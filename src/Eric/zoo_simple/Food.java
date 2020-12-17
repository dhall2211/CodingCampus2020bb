package Eric.zoo_simple;

public class Food {
    private String name;
    private String unit;
    private int tagesBedarf;

    public Food(String name, String unit){
        this.name = name;
        this.unit = unit;
        tagesBedarf = 0;
    }

    public void addDailyDemand(int demand){
        tagesBedarf += demand;
    }

    public void printStruktur(String prefix){
        System.out.printf("%s%s %d %s%n", prefix, name, tagesBedarf, unit);
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
}
