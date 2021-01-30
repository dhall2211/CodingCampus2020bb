package Daniel.Museum;

public class Thief extends Person implements IVisitor {
    private ArtPiece observedArtPiece;

    public Thief(String firstName, String lastName) {
        super(firstName, lastName, PersonType.THIEF);
    }

    @Override
    public String toString() {
        return "Thief{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public void leaveMuseum() {
        if(this.room != null){
            this.room.removePerson(this);
        }
        this.room = null;
        System.out.println("Thief " + firstName + " " + lastName + " leaves the museum.");
    }

    @Override
    public void observeArtPiece(ArtPiece artPiece) {
        observedArtPiece = artPiece;
    }
}
