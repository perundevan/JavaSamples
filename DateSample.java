import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateSample {
    static void main() {
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfWeek());



        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");

        String formattedDate = now.format(formatter);

        System.out.println(formattedDate);
    }
}
