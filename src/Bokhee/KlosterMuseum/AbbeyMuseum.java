package Bokhee.KlosterMuseum;

import java.util.*;

public class AbbeyMuseum {

    private static Random random = new Random();

    private String name;
    private Vector<ExhibitionRoom> exhibitionRooms;
    private Vector<Visitor> visitors;


    public AbbeyMuseum(String name) {
        this.name = name;
        this.exhibitionRooms = new Vector<>();
        this.visitors = new Vector<>();
    }

    public static boolean isSameVisitor(Visitor[] visitors, Visitor[] randomVisitors) {
        for (int i = 0; i < visitors.length; i++) {
            if (visitors[i].getName().equals(randomVisitors[i].getName())) {
                return false;
            }
        }
        return true;
    }

    public Vector<Visitor> generateVisitor(Visitor[] visitors) {

        Vector<Visitor> randomVisitors = new Vector<>();

        Visitor randomVisitor = null;
        int maxPersonsPerTour = 3;

        for (int i = 0; i < visitors.length; i++) {
            while (maxPersonsPerTour > randomVisitors.size()) {
                for (int j = 0; j < maxPersonsPerTour; j++) {
                    randomVisitor = visitors[random.nextInt(visitors.length)];
                    if (randomVisitor != null && !randomVisitors.contains(randomVisitor.getName())) {
                        randomVisitors.add(randomVisitor);
                    }
                }
                System.out.println("Random Visitors Group Number [" + i + "]: " + randomVisitors.toString());
            }
        }
        if (randomVisitor != null && !randomVisitors.contains(randomVisitor.getName())) {
            Visitor v = new Visitor(randomVisitor.getName());
            this.visitors.add(v);
            System.out.println(Arrays.toString(visitors));
        }
        return randomVisitors;
    }

    public void printVisitorGroupPerQuarterAnHour(Vector<Visitor> randomVisitors) {
        for (Visitor oneRandomVisitor : randomVisitors) {
            System.out.println("Random Visitors : " + oneRandomVisitor);
        }
    }
    public void addExhibitionRoom(ExhibitionRoom room) {
        if (!exhibitionRooms.contains(room)) {
            exhibitionRooms.add(room);
        }
    }

    public void addExhibitionRoom(ExhibitionRoom[] rooms) {
        for (ExhibitionRoom oneRoom: rooms) {
            if (!exhibitionRooms.contains(oneRoom)) {
                exhibitionRooms.add(oneRoom);
            }
        }
    }
    public void stroll(Visitor[] randomVisitors, ExhibitionRoom[] exhibitionRooms) {
        //  GregorianCalendar gc = new GregorianCalendar();
        //  var time = gc.toZonedDateTime();
        boolean isOpen = false;
        int indexExhibitionRoom = exhibitionRooms.length;
        ExhibitionRoom startingRoom = new ExhibitionRoom(00, "Information Robby");
        ExhibitionRoom randomRoom = null;
        for (Visitor oneRandomVisitor : randomVisitors) {
            oneRandomVisitor.stroll(startingRoom);
            while (indexExhibitionRoom < exhibitionRooms.length) {
                for (int i = 0; i < exhibitionRooms.length ; i++) {
                    randomRoom = exhibitionRooms[random.nextInt(this.exhibitionRooms.size())];
                    oneRandomVisitor.stroll(randomRoom);
                    System.out.println(oneRandomVisitor + "moved to the Room : " + randomRoom);
                }
            }
            isOpen = false;
        }
    }


    public void addVisitor(Visitor[] visitors) {
        for (Visitor oneVisitor : visitors) {
            this.visitors.add(oneVisitor);
        }
    }



    public ExhibitionRoom addAftersearchAndGeneratArt(int roomNumber, String name) {
        ExhibitionRoom e = null;
        for (int i = 0; i < exhibitionRooms.size(); i++) {
            if (exhibitionRooms.get(i).getName().equals(name)) {
                return exhibitionRooms.get(i);
            }
        }
        e = new ExhibitionRoom(roomNumber, name);
        exhibitionRooms.add(e);
        return e;
    }

    public Visitor createVisitor(String name) {
        return new Visitor(name);
    }

    @Override
    public String toString() {
        System.out.println("=======================================================");
        return "|\tWelcome to " + name + "\t\t|\n" +
                "-------------------------------------------------------" + "\n" +
                "exhibitionRooms : " + exhibitionRooms + "\n" +
                "-------------------------------------------------------";
    }

}