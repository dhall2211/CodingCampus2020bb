package Ali.ghanmi.com.OOP_Zoo;

public class Animal {
    private String name;
    private String tierart;
    private String herkuftLand;
    private int alt;
    private FoodAnimal preferedFood;
    private EnclosurePark animalPlace;
    private int dayliQauntiy;//


    public Animal(EnclosurePark animalPlace, String name, String tierart, String herkuftLand, int alt, int dayliQauntiy, FoodAnimal preferedFood) {
        this.name = name;
        this.tierart = tierart;
        this.herkuftLand = herkuftLand;
        this.alt = alt;
        this.animalPlace = animalPlace;
        this.dayliQauntiy = dayliQauntiy;
        this.preferedFood=preferedFood;

      preferedFood.tagesBedarfZufuegen(dayliQauntiy);
        animalPlace.add(this);
    }

    public void setAnimalPlace(EnclosurePark animalPlace) {
        this.animalPlace = animalPlace;
    }





    public void printStructure(String prefix) {
        System.out.println (prefix+"Name: " + name +", Tierart: "+ tierart +", Herkunft: "+ herkuftLand +", Alter: "+ alt+" "+ dayliQauntiy
        +" "+preferedFood.getVarietyOfFood()+" "+preferedFood.getMesureUnite());
    }


    }

