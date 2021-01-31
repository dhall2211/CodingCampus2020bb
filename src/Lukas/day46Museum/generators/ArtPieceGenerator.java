package Lukas.day46Museum.generators;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Lukas.day46Museum.models.ArtPiece;
import Lukas.day46Museum.enums.ArtType;


public abstract class ArtPieceGenerator {
	// Base code of this class was copied from Daniel
	private static String[] artists = new String[]{"aa", "bb", "cc", "dd", "ee", "ff", "gg", "hh", "ii", "jj", "kk", "ll", "mm", "nn", "oo"};
	private static Date startDate = new Date(-11676096000L);
	private static Date endDate = new Date(1577836800L);
	private static Random random = new Random(System.currentTimeMillis());

	// -- METHODS ----------------------------------------------------------------------------------
	public static ArtPiece createArtPiece() {
		ArtType artType = ArtType.getRandom();
		String title = getRandomString(5 + random.nextInt(5));
		String artist = artists[random.nextInt(artists.length-1)];
		Date createdDate = getRandomDate(startDate, endDate);
		Integer price = 100 + random.nextInt(900);
		
		return new ArtPiece(artType, title, artist, createdDate, price);
	}

	// -- HELPER -----------------------------------------------------------------------------------
	private static String getRandomString(int length){
		String generatedString = "";
		for (int i = 0; i < length; i++) {
			generatedString += (char)('A' + random.nextInt((byte)'Z'-(byte)'A'));
		}
		return generatedString;
	}

	private static Date getRandomDate(Date startInclusive, Date endExclusive) {
		long startMillis = startInclusive.getTime();
		long endMillis = endExclusive.getTime();
		long randomMillisSinceEpoch = ThreadLocalRandom
				.current()
				.nextLong(startMillis, endMillis);

		return new Date(randomMillisSinceEpoch);
	}
}
