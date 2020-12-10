package Ali.ghanmi.com.OOP_Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("county Zoo Park");

        EnclosurePark Vivarum = new EnclosurePark("Vivarum", 1970, 400, 20, zoo);
        EnclosurePark BirdPark = new EnclosurePark("Bird park", 1975, 20, 4, zoo);
        EnclosurePark WildAfrika = new EnclosurePark("Savana", 1970, 2000, 50, zoo);
        EnclosurePark WildAlpen = new EnclosurePark("Alpen", 1970, 2000, 50, zoo);

        Animal Rotmilan = new Animal(BirdPark, "Milan", "Greifvogel", "Schweiz", 3);
        Animal Turmfalke = new Animal(BirdPark, "Falcon", "Greifvogel", "Schweiz", 4);
        Animal Steinadler = new Animal(BirdPark, "Adler", "Greifvogel", "Schweiz", 5);
        Animal Uhu = new Animal(BirdPark, "Rose", "Greifvogel", "Schweiz", 2);


        Animal Capricorn = new Animal(WildAlpen, "Caprisio", "Ziegen", "Östereich", 7);
        Animal chamois = new Animal(WildAlpen, "Gämsli", "Ziegen", "Schweiz", 4);
        Animal pig = new Animal(WildAlpen, "Miss Pigy", "Paarhufer", "Deutschland", 2);


        Animal snake = new Animal(Vivarum, "Sniki", "Reptilien", "USA", 2);
        Animal crocodile = new Animal(Vivarum, "Crispi", "Reptilien", "USA", 60);
        Animal aquarum = new Animal(Vivarum, "Aqua Life", "Reptilien", "Diverse herkunft",0);


        Animal zebra = new Animal(WildAfrika, "Zora", "Equus", "Namibien", 4);
        Animal straus = new Animal(WildAfrika, "Ztone", "Vogel", "Noger", 4);
        Animal löwe = new Animal(WildAfrika, "Lora", "Katzen", "Namibien", 6);
        Animal elefant = new Animal(WildAfrika, "Babu", "Elephantidae", "Südafrika", 20);
        Animal affen = new Animal(WildAfrika, "Beauty", "Primaten", "Congo", 15);
        Animal affen2 = new Animal(WildAfrika, "Lovely", "Primaten", "Congo", 5);

        zoo.printStructure("  -");
        //System.out.println(zoo);
    }
}
