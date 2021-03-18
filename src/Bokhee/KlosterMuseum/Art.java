package Bokhee.KlosterMuseum;

public class Art {
    private int id;
    private String titleOfArt;
    private String artist;
    private double price;

    private static int nextId = 1;

    public Art(String titleOfArt) {
        this.id = nextId;
        ++nextId;
        this.titleOfArt = titleOfArt;
        this.artist = "";
        this.price = 0;
    }

    public Art(String titleOfArt, String artist, double price){
        this.id = nextId;
        ++nextId;
        this.titleOfArt = titleOfArt;
        this.artist = artist;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitleOfArt() {
        return titleOfArt;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Art{" +
                "id=" + id +
                ", author='" + titleOfArt + '\'' +
                ", price=" + price +
                '}';
    }


}
