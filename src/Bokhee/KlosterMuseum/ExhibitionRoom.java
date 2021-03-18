package Bokhee.KlosterMuseum;

import java.util.Vector;

public class ExhibitionRoom {
    private int roomNumber;
    private String Name;
    private Vector<Art> arts;

    public ExhibitionRoom(int roomNumber, String name) {
        this.roomNumber = roomNumber;
        this.Name = name;
        this.arts = new Vector<>();
    }

    public void addArt(Art art) {
        addAftersearchAndGeneratArt(art.getTitleOfArt());
        for (int i = 0; i < arts.size(); i++) {
            if (!arts.contains(art)) {
                arts.add(art);
            }
        }
    }

    public Art addAftersearchAndGeneratArt(String title) {
        Art a = null;
        for (int i = 0; i < arts.size(); i++) {
            if (arts.get(i).getTitleOfArt().equals(title)) {
                return arts.get(i);
            }
        }
        a = new Art(title);
        arts.add(a);
        return a;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "ExhibitionRoom{" +
                "roomNumber=" + roomNumber +
                ", Name='" + Name + '\'' +
                ", arts=" + arts +
                '}';
    }
}
