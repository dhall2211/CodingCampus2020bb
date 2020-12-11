package Ali.ghanmi.com.OOP_Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("county Zoo Park");
        FoodAnimal meat = new FoodAnimal(zoo,"meat","kg");
        FoodAnimal cereals = new FoodAnimal(zoo,"cereals","kg");
        FoodAnimal milk = new FoodAnimal(zoo,"milk","liter");
        FoodAnimal fruit = new FoodAnimal(zoo,"Fruits","kg");
        FoodAnimal heu = new FoodAnimal(zoo,"heu","kg");




        EnclosurePark vivarum = new EnclosurePark("Vivarum", 1970, 400, 20, zoo);
        EnclosurePark BirdPark = new EnclosurePark("Bird park", 1975, 20, 4, zoo);
        EnclosurePark WildAfrika = new EnclosurePark("Savana", 1970, 2000, 50, zoo);
        EnclosurePark WildAlpen = new EnclosurePark("Alpen", 1970, 2000, 50, zoo);

        Animal rotmilan = new Animal(BirdPark, "Milan", "Greifvogel", "Schweiz", 3,2,meat);
        Animal turmfalke = new Animal(BirdPark, "Falcon", "Greifvogel", "Schweiz", 4,2,meat);
        Animal steinadler = new Animal(BirdPark, "Adler", "Greifvogel", "Schweiz", 5,2,meat);
        Animal uhu = new Animal(BirdPark, "Rose", "Greifvogel", "Schweiz", 2,2,meat);



        Animal Capricorn = new Animal(WildAlpen, "Caprisio", "Ziegen", "Östereich", 7,5,heu);
        Animal chamois = new Animal(WildAlpen, "Gämsli", "Ziegen", "Schweiz", 4,5,heu);
        Animal pig = new Animal(WildAlpen, "Miss Pigy", "Paarhufer", "Deutschland", 2,5,heu);


        Animal snake = new Animal(vivarum, "Sniki", "Reptilien", "USA", 2,2,meat);
        Animal crocodile = new Animal(vivarum, "Crispi", "Reptilien", "USA", 60,10,meat);
        Animal aquarum = new Animal(vivarum, "Aqua Life", "Reptilien", "Diverse herkunft",0,2,cereals);


        Animal zebra = new Animal(WildAfrika, "Zora", "Equus", "Namibien", 4,4,heu);
        Animal straus = new Animal(WildAfrika, "Ztone", "Vogel", "Noger", 4,2,cereals);
        Animal löwe = new Animal(WildAfrika, "Lora", "Katzen", "Namibien", 6,10,meat);
        Animal elefant = new Animal(WildAfrika, "Babu", "Elephantidae", "Südafrika", 20,10,heu);
        Animal affen = new Animal(WildAfrika, "Beauty", "Primaten", "Congo", 15,3,fruit);
        Animal affen2 = new Animal(WildAfrika, "Lovely", "Primaten", "Congo",2,2,fruit);



        zoo.printStructure("  -");
        //System.out.println(zoo);
    }
}
