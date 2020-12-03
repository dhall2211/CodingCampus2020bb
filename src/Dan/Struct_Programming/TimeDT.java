import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeDT {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(today.format(usDateFormat));


        DateTimeFormatter euDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(today.format(euDateFormat));

    }
}
