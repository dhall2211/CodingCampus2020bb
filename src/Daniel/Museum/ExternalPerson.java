package Daniel.Museum;

public class ExternalPerson extends Person implements IVisitor {
    private ArtPiece observedArtPiece;

    public ExternalPerson(String firstName, String lastName, PersonType personType) {
        super(firstName, lastName, personType);
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
