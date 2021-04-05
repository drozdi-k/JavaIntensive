package codewars;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EverybodyHatesMondays {
    static long count(final LocalDate birthday, final LocalDate today) {
        long countOfMondays = 0;
        LocalDate date;
        for (date = birthday.plusYears(22); date.isBefore(today); date = date.plusDays(1)) {
            if (date.equals(birthday.plusYears(78))) break;
            if (date.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                countOfMondays++;
                date.plusDays(6);
            }
        }
        if (date.isEqual(today) && date.getDayOfWeek().equals(DayOfWeek.MONDAY)) countOfMondays++;
        return countOfMondays;
    }
}
