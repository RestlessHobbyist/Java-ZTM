package org.example;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class DateTimeFormattingParsingExample {
    public static void main(String[] args) {
        LocalDateTime present = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy HH:mm");
        System.out.println(present.format(dtf));


        String date = "November 21 2023";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDate ld = LocalDate.parse(date, dtf2);
        System.out.println("String to Date: " + ld.format(dtf2));

        DateTimeFormatterBuilder dtfb = new DateTimeFormatterBuilder();
        System.out.println("Chronofield Day of week: " + ChronoField.DAY_OF_WEEK);
        DateTimeFormatter dtfp = dtfb.appendLiteral("Today is: ")
                .appendText(ChronoField.DAY_OF_WEEK)
                .appendLiteral(", ")
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral("/")
                .appendValue(ChronoField.DAY_OF_MONTH)
                .appendLiteral("/")
                .appendValue(ChronoField.YEAR)
                .toFormatter();
        System.out.println(LocalDate.now().format(dtfp));

    }
    //I knew this wasn't needed, that the 'Day of the week' for the Chronofield had the weekday name, but I wanted the practice of writing the switch case
//    public static String getNameOfWeekday(ChronoField day){
//        String weekdayName = "";
//        switch (day) {
//            case 1:
//                weekdayName = "Monday";
//                break;
//            case 2:
//                weekdayName = "Tuesday";
//                break;
//            case 3:
//                weekdayName = "Wednesday";
//                break;
//            case 4:
//                weekdayName = "Thursday";
//                break;
//            case 5:
//                weekdayName = "Friday";
//                break;
//            case 6:
//                weekdayName = "Saturday";
//                break;
//            case 7:
//                weekdayName = "Sunday";
//                break;
//            default:
//                weekdayName = "A week doesn't have more than 7 days...";
//        }
//        return weekdayName;
//    }

}


//3. Format the LocalDateTime object using a DateTimeFormatter with a specific pattern.
//
//4. Parse a date string for November 21 2023 into a LocalDate object using a DateTimeFormatter with a specific pattern.
//
//5. Print the formatted date and the parsed date.
