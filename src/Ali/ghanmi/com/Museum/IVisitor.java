package Ali.ghanmi.com.Museum;

public interface IVisitor {
    void observeArtPiece(ArtPiece artPiece);
    void leaveMuseum();
}
