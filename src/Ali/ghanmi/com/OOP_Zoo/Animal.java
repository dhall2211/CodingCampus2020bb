package Ali.ghanmi.com.OOP_Zoo;

public class Animal {
    private String name;
    private String tierart;
    private String herkuftLand;
    private int alt;
    private EnclosurePark animalPlace;
    private FoodAnimal indevueduelfood;//


    public Animal(EnclosurePark animalPlace, String name, String tierart, String herkuftLand, int alt) {
        this.name = name;
        this.tierart = tierart;
        this.herkuftLand = herkuftLand;
        this.alt = alt;
        this.animalPlace = animalPlace;
      //  this.indevueduelfood= indevueduelfood;
        animalPlace.add(this);
    }

    public void setAnimalPlace(EnclosurePark animalPlace) {
        this.animalPlace = animalPlace;
    }





    public void printStructure(String prefix) {
        System.out.println (prefix+"Name: " + name +", Tierart: "+ tierart +", Herkunft: "+ herkuftLand +", Alter: "+ alt);
    }


    }

