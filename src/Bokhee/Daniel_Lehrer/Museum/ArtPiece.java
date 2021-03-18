package Bokhee.Daniel_Lehrer.Museum;

import java.util.Date;

public class ArtPiece {
   private String type;
   private String title;
   private String artist;
   private Date createdDate;
   private Integer price;

    public ArtPiece(String type, String title, String artist, Date createdDate, Integer price) {
        this.type = type;
        this.title = title;
        this.artist = artist;
        this.createdDate = createdDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ArtPiece{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", createdDate=" + createdDate +
                ", price=" + price +
                '}';
    }

    public Integer getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
