package Daniel.Museum;

public class Visitor extends Person implements IVisitor {
    private ArtPiece observedArtPiece;

    public Visitor(String firstName, String lastName) {
        super(firstName, lastName, PersonType.VISITOR);
    }

    @Override
    public void leaveMuseum() {
        if(this.room != null){
            this.room.removePerson(this);
        }
        this.room = null;
        System.out.println("Visitor " + firstName + " " + lastName + " leaves the museum.");
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public void observeArtPiece(ArtPiece artPiece) {
        observedArtPiece = artPiece;
    }
}
