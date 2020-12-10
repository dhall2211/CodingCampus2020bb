package Ali.ghanmi.com.OOP_Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("county Zoo Park");

        EnclosurePark vivarum = new EnclosurePark("Vivarum", 1970, 400, 20, zoo);
        EnclosurePark BirdPark = new EnclosurePark("Bird park", 1975, 20, 4, zoo);
        EnclosurePark WildAfrika = new EnclosurePark("Savana", 1970, 2000, 50, zoo);
        EnclosurePark WildAlpen = new EnclosurePark("Alpen", 1970, 2000, 50, zoo);

        Animal rotmilan = new Animal(BirdPark, "Milan", "Greifvogel", "Schweiz", 3);
        Animal turmfalke = new Animal(BirdPark, "Falcon", "Greifvogel", "Schweiz", 4);
        Animal steinadler = new Animal(BirdPark, "Adler", "Greifvogel", "Schweiz", 5);
        Animal uhu = new Animal(BirdPark, "Rose", "Greifvogel", "Schweiz", 2);



        Animal Capricorn = new Animal(WildAlpen, "Caprisio", "Ziegen", "Östereich", 7);
        Animal chamois = new Animal(WildAlpen, "Gämsli", "Ziegen", "Schweiz", 4);
        Animal pig = new Animal(WildAlpen, "Miss Pigy", "Paarhufer", "Deutschland", 2);


        Animal snake = new Animal(vivarum, "Sniki", "Reptilien", "USA", 2);
        Animal crocodile = new Animal(vivarum, "Crispi", "Reptilien", "USA", 60);
        Animal aquarum = new Animal(vivarum, "Aqua Life", "Reptilien", "Diverse herkunft",0);


        Animal zebra = new Animal(WildAfrika, "Zora", "Equus", "Namibien", 4);
        Animal straus = new Animal(WildAfrika, "Ztone", "Vogel", "Noger", 4);
        Animal löwe = new Animal(WildAfrika, "Lora", "Katzen", "Namibien", 6);
        Animal elefant = new Animal(WildAfrika, "Babu", "Elephantidae", "Südafrika", 20);
        Animal affen = new Animal(WildAfrika, "Beauty", "Primaten", "Congo", 15);
        Animal affen2 = new Animal(WildAfrika, "Lovely", "Primaten", "Congo",2);

        FoodAnimal food = new FoodAnimal(zoo,rotmilan,"meat",0.5,"kg");
        FoodAnimal food1 = new FoodAnimal(zoo,steinadler,"meat",0.8,"kg");
        FoodAnimal food2 = new FoodAnimal(zoo,uhu,"meat",0.3,"kg");
        FoodAnimal food3 = new FoodAnimal(zoo,turmfalke,"meat",0.5,"kg");

        FoodAnimal food4 = new FoodAnimal(zoo,crocodile,"meat",4,"kg");
        FoodAnimal food5 = new FoodAnimal(zoo,löwe,"meat",5,"kg");
        FoodAnimal food6 = new FoodAnimal(zoo,chamois,"cereals",5,"kg");
        FoodAnimal food7 = new FoodAnimal(zoo,Capricorn,"cereals",3,"kg");

        FoodAnimal food8 = new FoodAnimal(zoo,affen,"fruit",4,"kg");
        FoodAnimal food9 = new FoodAnimal(zoo,affen2,"fruit",5,"kg");
        FoodAnimal food10 = new FoodAnimal(zoo,zebra,"cereals",5,"kg");
        FoodAnimal food11 = new FoodAnimal(zoo,straus,"cereals",3,"kg");

        FoodAnimal food12 = new FoodAnimal(zoo,affen,"Milk",3,"Liter");
        FoodAnimal divers = new FoodAnimal(zoo,aquarum,"Aquarum food",2,"kg");


        zoo.printStructure("  -");
        //System.out.println(zoo);
    }
}
