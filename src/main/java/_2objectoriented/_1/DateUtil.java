package _2objectoriented._1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class DateUtil {

    public static int calculatorElapsedYears(String yyyyMMdd) {

        LocalDate targetDate = createLocalDate(yyyyMMdd);
        LocalDate today = createLocalDate("20150202");

        return getElapsedYears(targetDate, today);

    }

    private static LocalDate createLocalDate(String yyyyMMdd) {
        return LocalDate.parse(yyyyMMdd, createFormatter());
    }

    private static DateTimeFormatter createFormatter() {
        return DateTimeFormatter.ofPattern("uuuuMMdd").withResolverStyle(ResolverStyle.STRICT);
    }

    private static int getElapsedYears(LocalDate targetDate, LocalDate today) {
        return Period.between(targetDate, today).getYears();
    }
}
