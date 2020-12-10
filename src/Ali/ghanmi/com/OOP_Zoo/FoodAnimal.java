package Ali.ghanmi.com.OOP_Zoo;

public class FoodAnimal {
    private String varietyOfFood;
    private double Quantity;
    private String mesureUnite;
    private Zoo zoo;
    private Animal animal;

    public FoodAnimal(Zoo zoo,Animal animal,String varietyOfFood, double quantity, String mesureUnite) {
        this.varietyOfFood = varietyOfFood;
        this.zoo=zoo;
        this.animal=animal;
        Quantity = quantity;
        this.mesureUnite = mesureUnite;
        zoo.addFood(this);


       // this.animal = animal;
    }

    public String getVarietyOfFood() {
        return varietyOfFood;
    }

    public double getQuantity() {
        return Quantity;
    }

    public String getMesureUnite() {
        return mesureUnite;
    }

    @Override
    public String toString() {
        return "Food: "+ varietyOfFood +", Quantity: " + Quantity + "" + mesureUnite;
    }
}
