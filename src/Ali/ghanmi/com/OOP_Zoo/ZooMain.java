package Ali.ghanmi.com.OOP_Zoo;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("county Zoo Park");

        EnclosurePark Vivarum = new EnclosurePark("Vivarum", 1970, 400, 20, zoo);
        EnclosurePark ReptilesWater = new EnclosurePark("Wasser reptiles", 1975, 20, 4, zoo);
        EnclosurePark ReptilesErth = new EnclosurePark("Erde reptiles", 1976, 40, 40, zoo);
        EnclosurePark Marina = new EnclosurePark("Ocean&see", 1980, 300, 40, zoo);

        EnclosurePark WildAfrika = new EnclosurePark("Savana", 1970, 2000, 50, zoo);
        EnclosurePark WildCatS = new EnclosurePark("Raubkatzen", 1970, 500, 10, zoo);
        EnclosurePark Wildsahara = new EnclosurePark("Sahara wild", 1980, 1000, 50, zoo);
        EnclosurePark WildZentrallAfrika = new EnclosurePark("Zentrall afrika vielfalt", 1980, 1000, 10, zoo);

        EnclosurePark WildAlpen = new EnclosurePark("Savana", 1970, 2000, 50, zoo);
        EnclosurePark birds = new EnclosurePark("Raubkatzen", 1970, 2000, 50, zoo);

        Animals snik = new Animals(Vivarum,"balboa","schlange","USA",2);


        zoo.printZoo("* ");
        //System.out.println(zoo);
    }
}
