package Lukas.day46Museum.interfaces;

import Lukas.day46Museum.models.ArtPiece;


public interface IVisitor {
	void observeArtPiece(ArtPiece artPiece);
	void leaveMuseum();
}
