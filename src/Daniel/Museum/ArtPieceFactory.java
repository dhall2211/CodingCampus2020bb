package Daniel.Museum;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArtPieceFactory {
    private static String[] types = new String[]{"Gemälde", "Skulptur", "Plastik", "Moderne Kunst"};
    private static String[] artists = new String[]{"Davinci", "Dali", "Van Gogh", "Monned"};
    private static Date startDate = new Date(-11676096000L);
    private static Date endDate = new Date(1577836800L);

    public static ArtPiece createArtPiece() {
        Random random = new Random();

        String type = types[random.nextInt(types.length-1)];
        String title = getRandomString(5 + random.nextInt(5));
        String artist = artists[random.nextInt(artists.length-1)];
        Date createdDate = getRandomDate(startDate, endDate);
        Integer price = 100 + random.nextInt(900);

        return new ArtPiece(type, title, artist, createdDate, price);
    }

    private static String getRandomString(int length){
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
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
}
