package Bokhee.Daniel_Lehrer.Museum;

import Bokhee.Daniel_Lehrer.Museum.Factories.ArtPieceFactory;

import java.util.LinkedList;
import java.util.Random;

public class Curator extends Person {
    private int donations;
    private Random random = new Random();

    public Curator(String firstName, String lastName) {
        super(firstName, lastName, PersonType.CURATOR);
    }

    public void collectDonations(int maxDonationsPerDay) {
        donations += random.nextInt(maxDonationsPerDay);
    }

    public void buyNewArtPiece(LinkedList<Room> rooms) {
        var artPiece = ArtPieceFactory.createArtPiece();
        if(artPiece.getPrice() <= donations){
            donations -= artPiece.getPrice();
            int randomRoomIndex = random.nextInt(rooms.size());
            rooms.get(randomRoomIndex).addArtPiece(artPiece);
            System.out.println("Curator buys new art piece "+ artPiece.getTitle() + " for " + artPiece.getPrice() + "€");
        }
    }
}
