package Daniel.Museum;

public interface IVisitor {
    void observeArtPiece(ArtPiece artPiece);
    void leaveMuseum();
}
