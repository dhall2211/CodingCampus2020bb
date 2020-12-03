package com.company;

public class Hotel {
    private int guests;
    private int rooms;
    public Hotel() {}
    public int getRooms() {
        return rooms;

    }
    public  void setRooms(int rooms) {
        this.rooms = rooms;

    }

    public boolean hasVacany() {
        return rooms > 0;
    }
    public void makeABooking() {
        if(guests < rooms) {
            guests += 1;
        } else {
            handleTooMany();
        }

    }
    private void handleTooMany() {
        System.out.println("there are too many guest booked");
    }


}
