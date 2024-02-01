package org.example;

import java.time.*;

public class ZonedDateTimeDurationPeriodExample {
    public static void main(String[] args) {
        ZonedDateTime overseasEvent = ZonedDateTime.of(2023,10,31,12,30,0,0, ZoneId.of("America/Chicago"));
        System.out.println(overseasEvent);

        LocalTime time1 = LocalTime.of(9,0);
        LocalTime time2 = LocalTime.of(17,0);
        Duration timeDiff = Duration.between(time1,time2);
        System.out.println("Difference between times: " + timeDiff);

        LocalDate date1 = LocalDate.of(2023,1,1);
        LocalDate date2 = LocalDate.of(2023,12,31);
        Period dateDiff = Period.between(date1,date2);
        System.out.println("Difference between dates: " + dateDiff);

    }
}
