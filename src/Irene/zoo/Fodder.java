package Irene.zoo;

public class Fodder {
    private String fodderName;
    private String unit;
    private int dailyConsumption;

    public Fodder(String fodderName, String unit) {
        this.fodderName = fodderName;
        this.unit = unit;
        dailyConsumption = 0;

//        zoo.addFodder(this);
    }

    public void addRequiredFodder(int requiredFodder) {
        dailyConsumption += requiredFodder;
    }

    public void printStructureFodder(String prefix) {
        System.out.printf("%s%s %d %s%n", prefix, fodderName, dailyConsumption, unit);
    }

    public String getUnit() {
        return unit;
    }

    public String getFodderName() {
        return fodderName;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
