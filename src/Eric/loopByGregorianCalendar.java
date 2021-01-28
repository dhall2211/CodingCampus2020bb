package Eric;

import java.util.Calendar;

public class loopByGregorianCalendar {

    public static void main(String[] args) {
        var openingTime = 8;
        var closingTime = 16;
        var interval = 35;

        loopByGregorianDate(openingTime, closingTime, interval);
    }

    private static void loopByGregorianDate(int openingTime, int closingTime, int intervalByMinutes) {
        Calendar now = Calendar.getInstance();

        var open = (Calendar) now.clone();
        var close = (Calendar) now.clone();

        open.set(Calendar.HOUR_OF_DAY, openingTime);
        open.set(Calendar.MINUTE, 0);
        close.set(Calendar.HOUR_OF_DAY, closingTime);
        close.set(Calendar.MINUTE, 0);

        while (open.compareTo(close) < 0) {
            open.add(Calendar.MINUTE, intervalByMinutes);
            // Logic here
            System.out.println(open.getTime());
        }
    }
}
