package Marcella.Museum;

import Gyula.oop.MultiInterfaces.IPrintStructure;

import java.util.Random;

public class Art implements IPrintStructure {

    private String type;
    private String title;
    private String artist;
    private String year;
    private double price;
    private static Random random = new Random(System.nanoTime());

    public Art() {
        this.type = type;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    // functions ------------------------------------------
    public void generateArt() {
        String[] type = {"Statue", "Painting"};
        String[] title = {"Madonna", "Saint", "Vanitas", "Pietà", "Trinité"};
        String[] artist = {"Grünewald", "Tizian", "Michelangelo", "Da Vinci", "unknown"};
        String[] year = {"1640", "1592", "1400", "1813", "unknown"};
        Double[] price = {12800.00, 300000.00, 52000.00, 999999.00, 200.00};

        this.type = type[random.nextInt(type.length)];
        this.title = title[random.nextInt(title.length)];
        this.artist = artist[random.nextInt(artist.length)];
        this.year = year[random.nextInt(year.length)];
        this.price = price[random.nextInt(price.length)];
    }

    @Override
    public String toString() {
        return type + ", title: " + title +
                ", artist: " + artist +
                ", year: " + year +
                ", price: " + price;
    }

    public void printStructure() {
        System.out.println(type + ", title: " + title +
                ", artist: " + artist +
                ", year: " + year +
                ", price: " + price);
    }

}
