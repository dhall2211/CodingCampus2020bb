package Bokhee.KlosterMuseum;

import java.util.Arrays;

public class AbbeyMuseum_Main {
    public static void main(String[] args) {


        //Art cherryBlossom = new Art(101,"Cherry Blossom",500);
        AbbeyMuseum kims_gallery = new AbbeyMuseum("Kims Gallery");

        ExhibitionRoom a1850 = new ExhibitionRoom(01, "Post Impressionism");
        ExhibitionRoom a1600 = new ExhibitionRoom(11, "Baroque");
        kims_gallery.addExhibitionRoom(a1850);
        kims_gallery.addExhibitionRoom(a1600);
        a1850.addAftersearchAndGeneratArt("Sunflower");
        a1850.addAftersearchAndGeneratArt("Cherry Blossom");
        a1600.addAftersearchAndGeneratArt("Night Watch");
        a1600.addAftersearchAndGeneratArt("Bathsheba at Her Bath");

        ExhibitionRoom a1500 = new ExhibitionRoom(02, "Renaissance");

        a1500.addAftersearchAndGeneratArt("The Creating of Adam");
        a1500.addAftersearchAndGeneratArt("Teh Delphic Sibyl");
        a1500.addAftersearchAndGeneratArt("The last Judgement");
        a1500.addAftersearchAndGeneratArt("The Resurrection of Christ");
        a1500.addAftersearchAndGeneratArt("Pieta");


        Visitor frau1 = new Visitor("Anna", 30, "Widnau");
        Visitor kind1 = new Visitor("Natali", 11, "Widnau");
        Visitor man1 = new Visitor("Miki", 22, "Widnau");
        Visitor man2 = new Visitor("Hans", 34, "Widau");
        Visitor frau2 = new Visitor("Hana", 67, "Widnau");
        Visitor kind2 = new Visitor("Isabel", 7, "Rebstein");
        Visitor man3 = new Visitor("Andre", 40, "St.Gallen");

        Visitor[] group1 = {frau1, kind1, man1, man2, frau2, kind2, man3};

        //kims_gallery.addVisitor(group1);

        // System.out.println(a1850.toString());
        // System.out.println(kims_gallery);

        kims_gallery.printVisitorGroupPerQuarterAnHour(kims_gallery.generateVisitor(group1));
        kims_gallery.addExhibitionRoom(a1850);
        kims_gallery.addExhibitionRoom(a1600);
        kims_gallery.addExhibitionRoom(a1500);

        ExhibitionRoom[] exhibitionRoomList = {a1500, a1600, a1850};
        kims_gallery.stroll(group1,exhibitionRoomList);

    }
}
