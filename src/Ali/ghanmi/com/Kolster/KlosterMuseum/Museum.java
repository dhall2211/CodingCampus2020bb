package Ali.ghanmi.com.Kolster.KlosterMuseum;

import java.util.Vector;

public class Museum {
    private String name;
    private Vector<Room> rooms;
    private Vector<Visitor> visitors;

    public Museum(String name) {
        this.name = name;
        this.rooms = new Vector<>();
        this.visitors = new Vector<>();

    }

    public void addRomm(Room r) {
        rooms.add(r);
    }

    public void dailyRoutine() {
        int close = 9;
        while (!isClose(close)) {
            Visitor.addVisitor();
            close++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) { /* Ignore */ }
        }

    }



        @Override
        public String toString () {
            return "Museum: " + name + "\n Roomes" + rooms + "\n Visitors" + visitors;
        }


    private boolean isClose(int close) {
        if (close==16){
            return true;
        }
        return false;
    }
    }
