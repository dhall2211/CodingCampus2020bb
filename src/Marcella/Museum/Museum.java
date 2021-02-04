package Marcella.Museum;

import Gyula.oop.MultiInterfaces.IPrintStructure;

import java.util.Vector;
import java.util.Random;

public class Museum implements IPrintStructure {

    private String name;
    private double openingHour;
    private double closingHour;
    private double visitingEnd;
    private Curator curator;
    private Vector<Room> rooms;
    private Vector<Guard> guards;
    private static Random random = new Random(System.nanoTime());
    private boolean isOpen;
    private boolean isVisitingTime;

    public Museum(String name, double openingHour, double closingHour, double visitingEnd) {
        this.name = name;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.visitingEnd = visitingEnd;
        this.isOpen = true;
        this.isVisitingTime = true;
        this.rooms = new Vector<>();
        this.guards = new Vector<>();
    }

    // getter ------------------------

    public Vector<Room> getRooms() {
        return rooms;
    }

    public boolean isOpen() {
        return isOpen;
    }
    
    // functions ----------------------

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

    public void addGuard(Guard guard) {
        this.guards.add(guard);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    // creates given number of artpieces for one room ===========================
    public void addArtToRoom(int artPiecesInRoom) {
        for (Room oneRoom : rooms) {
            for (int i = 1; i <= artPiecesInRoom; i++) {
                Art newArt = new Art();
                newArt.generateArt();
                oneRoom.getArtPieces().add(newArt);
            }
        }
    }

    // Simultation every 15 minutes (while museum isOpen)===================================================
    public void runSimultation() {
        Room startingRoom = rooms.get(0);
        double visitingTime = (visitingEnd - openingHour) * 4;
        double openingTime = (closingHour - openingHour) * 4;

        while (openingTime != 0) {
            if (visitingTime != 0 && isVisitingTime == true) {
                createVisitors(startingRoom);
                visitingTime--;
            } else {
                isVisitingTime = false;
            }
            for (Room oneRoom : rooms) {
                for (Visitor oneVisitor : oneRoom.getVisitors()) {
                    oneVisitor.setToChange(true);
                }
            }
            for (Room oneRoom : rooms) {
                if (oneRoom.getVisitors().size() != 0) {
                        oneRoom.visitorDo(rooms);
                }
            }
            // guardsDo();
            // curatorDoes();
            openingTime--;
        }
        isOpen = false;
    }

    public void createVisitors(Room startingRoom) {
        int randomNumber = random.nextInt(3);
        for (int i = 0; i <= randomNumber; i++) {
            Visitor newVisitor = new Visitor(startingRoom);
            newVisitor.generateVisitor();
            if (randomNumber == 0) {
                newVisitor.setThief(true);
            }
            startingRoom.getVisitors().add(newVisitor);
            System.out.println(newVisitor.getName() + " betritt das Museum. Dieb: " + newVisitor.isThief());
        }
    }

    @Override
    public String toString() {
        return "Museum: " + name +
                "\n curator: " + curator +
                "\n guards: " + guards +
                "\n isOpen: " + isOpen +
                "\n isVisitingTime: " + isVisitingTime +
                "\n rooms: " + rooms;
    }

    public void printStructure() {
        System.out.println("\n Museum: " + name);
    }

    }
