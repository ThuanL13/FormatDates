package com.pluralsight;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDates {
    public static void main(String[] args) {
        // Getting current GMT time
        // Creates GMT timezone| Gets current date/time| Variable called GMT
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT")); // yyyy-MM-dd T.hr:min:sec

        // Formatting
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm", Locale.ENGLISH );

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy", Locale.ENGLISH);

        System.out.println(gmtTime.format(format1));
        System.out.println(gmtTime.format(format2));
        System.out.println(gmtTime.format(format3));
        System.out.println(gmtTime.format(format4));




    }
}
