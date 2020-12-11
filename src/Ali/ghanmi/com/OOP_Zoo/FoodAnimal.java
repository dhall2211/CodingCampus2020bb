package Ali.ghanmi.com.OOP_Zoo;

public class FoodAnimal {
    private String varietyOfFood;
    private String mesureUnite;
private int dayliQuantity;

    public FoodAnimal(Zoo zoo,String varietyOfFood,  String mesureUnite) {
        this.varietyOfFood = varietyOfFood;
        this.mesureUnite = mesureUnite;
       dayliQuantity=0;
        zoo.addFood(this);
        // this.animal = animal;
    }
    public String getVarietyOfFood() { return varietyOfFood; }
    public String getMesureUnite() { return mesureUnite; }
    public void tagesBedarfZufuegen(int tagesbedarf) {
        dayliQuantity += tagesbedarf;
    }

    @Override
    public String toString() {
        return "Food: "+ varietyOfFood +", Quantity: " + "" + mesureUnite;
    }

    public void printStructure(String prefix) {
        System.out.printf("%s%s %d %s%n", prefix, varietyOfFood,dayliQuantity, mesureUnite);
    }
}
