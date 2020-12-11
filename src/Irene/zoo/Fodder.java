package Irene.zoo;

public class Fodder {
    private final String fodderName;
    private final String unit;
    private int dailyConsumption;

    public Fodder(Zoo zoo, String fodderName, String unit) {
        this.fodderName = fodderName;
        this.unit = unit;
        dailyConsumption = 0;

        zoo.addFodder(this);
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
}
