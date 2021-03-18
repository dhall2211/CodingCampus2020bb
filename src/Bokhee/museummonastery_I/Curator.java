package Bokhee.museummonastery_I;


import Bokhee.museummonastery_I.factories.ArtPieceFactory;
import Bokhee.museummonastery_I.factories.PersonFactory;

import java.util.Random;

public class Curator {
    private String name;
    private double donationsTotal;
    private static Random random = new Random(System.currentTimeMillis());

    public Curator( String name,double donationsTotal) {
        this.donationsTotal = donationsTotal;
        this.name = name;
    }


    public double getDonation() {
        var visitors = PersonFactory.createVisitors(20);
        for (var visitor : visitors) {
            int donationAmount = (random.nextInt((int) Math.random() + 1 * 120));
            this.donationsTotal += donationAmount;
            System.out.println(visitor.getFirstName() + " " + visitor.getLastName() + " makes a donation of " + donationAmount + "CHF");
        }
        System.out.println(donationsTotal + "CHF Donation has been made for the next artpiec to buy.");
        return this.donationsTotal;
    }

    public void removeArtPiece(ArtPiece artPiece, Room room, double donationLimit) {
        if (donationsTotal == donationLimit) {
            room.removeArtPiece(artPiece);
            System.out.println("The accumulated donation  for " + artPiece + "is : " + donationsTotal);
            System.out.println(artPiece + "is moved to the room  --> " + room.getId());
        }
    }

    public void buyArtPiece(Room room, int buyingPrice){
        ArtPiece newPiece = ArtPieceFactory.createArtPiece();
        if(newPiece.getPrice() <= donationsTotal) {
            donationsTotal -= newPiece.getPrice();
            room.addArtPiece(newPiece);
            System.out.println(this.name + "  has bought a artnpiece at : " + buyingPrice +" CHF");
        }
    }

    public String getName() {
        return name;
    }

    public double getDonationsTotal() {
        return donationsTotal;
    }

    @Override
    public String toString() {
        return "Curator{" +
                "name='" + name + '\'' + '}';


    }
}
