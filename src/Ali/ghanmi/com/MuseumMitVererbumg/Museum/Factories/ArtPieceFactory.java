package Ali.ghanmi.com.MuseumMitVererbumg.Museum.Factories;

import Ali.ghanmi.com.MuseumMitVererbumg.Museum.ArtPiece;

import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArtPieceFactory {
    private static String[] types = new String[]{"Gemälde", "Skulptur", "Plastik", "Moderne Kunst"};
    private static String[] artists = new String[]{"Davinci", "Dali", "Van Gogh", "Monned"};
    private static Date startDate = new Date(-11676096000L);
    private static Date endDate = new Date(1577836800L);
    private static Random random = new Random(System.currentTimeMillis());

    public static ArtPiece createArtPiece() {
        String type = types[random.nextInt(types.length-1)];
        String title = getRandomString(5 + random.nextInt(5));
        String artist = artists[random.nextInt(artists.length-1)];
        Date createdDate = getRandomDate(startDate, endDate);
        Integer price = 100 + random.nextInt(900);
        
        return new ArtPiece(type, title, artist, createdDate, price);
    }

    private static String getRandomString(int length){
        String generatedString = "";
        for (int i = 0; i < length; i++) {
            generatedString += (char)('A' + random.nextInt((byte)'Z'-(byte)'A'));
        }
        return generatedString;
    }

    public static Date getRandomDate(Date startInclusive, Date endExclusive) {
        long startMillis = startInclusive.getTime();
        long endMillis = endExclusive.getTime();
        long randomMillisSinceEpoch = ThreadLocalRandom
                .current()
                .nextLong(startMillis, endMillis);

        return new Date(randomMillisSinceEpoch);
    }

    public static LinkedList<ArtPiece> createArtPieces(int artPiecesCount) {
        LinkedList<ArtPiece> artPieces = new LinkedList<>();
        for(int i = 0; i < artPiecesCount; i++){
            artPieces.add(createArtPiece());
        }
        return artPieces;
    }
}
