package learning;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTimeSimpleExample
{
    public static void main(String[] args)
    {
        //nextSunday();
        // goBack();
        
        try {
            String dateStr = "1:30";

               DateFormat srcDf = new SimpleDateFormat("hh:mm");
               Date date = srcDf.parse(dateStr);
               
               System.out.println("Original date : "+date);
               
               DateFormat destDf = new SimpleDateFormat("HH:mm:ss");
                dateStr = destDf.format(date);
               System.out.println("Converted date is : " + dateStr);
           }
           catch (ParseException e) {
               e.printStackTrace();
           }
    }

    private static void goBack()
    {
        LocalDateTime dateTime = LocalDateTime.of(1900, 01, 01, 00, 00);
        System.out.println("Old Date:" + dateTime + "  EPoch:" + dateTime.toEpochSecond(ZoneOffset.UTC));

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned:" + zonedDateTime);
        System.out.println("Zoned:" + zonedDateTime.withZoneSameInstant(ZoneId.of("UTC")));

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("offsetDateTime: " + offsetDateTime);

    }

    private static void nextSunday()
    {
        LocalDate date = LocalDate.now();
        if (date.getDayOfWeek() != DayOfWeek.SUNDAY)
        {
            date = date.plus((DayOfWeek.SUNDAY.getValue() - date.getDayOfWeek().getValue()), ChronoUnit.DAYS);
        }
        System.out.println("Next sunday on " + date);
        System.out.println(DayOfWeek.MONDAY.plus(7));

        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < ar.length; i++)
        {
            for (int j = -10; j < 10; j++)
            {
                movePlaces(ar, i, j);
            }
        }
    }

    // check logic in plus
    private static void movePlaces(int[] ar, int index, int place)
    {
        int amount = place % 9;
        System.out.println("Out of " + "(" + (index + 1) + "," + place + ") : " + ar[(index + amount+9) % 9]);

    }
}
