package Marcella.Museum;

public class Curator {

    private String name;
    private Art artPiece;

    public Curator(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ", artPieces: " + artPiece;
    }
}
