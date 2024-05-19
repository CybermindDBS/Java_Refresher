import java.security.SecureRandom;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;

public class JavaUtilities {
    public static void main(String[] args) {
        Math();
    }

    public static void Math()
    {
//        Useful methods:
//        Math.abs();
//        Math.max();
//        Math.min();
//        Math.ceil();
//        Math.floor();
//        Math.round();
//        Math.random();
//        Math.log();
//        Math.log10();
//        Math.pow();
//        Math.sqrt();
//        Math.toIntExact();
    }

    public static void Arrays()
    {
//        Useful methods:
//        Arrays.toString();
//        Arrays.binarySearch();
//        Arrays.copyOf();
//        Arrays.copyOfRange();
//        Arrays.sort();
//        Arrays.stream();
//        Arrays.fill();
    }

    public static void Collections()
    {
//        Useful methods:
//        Collections.binarySearch();
//        Collections.reverse();
//        Collections.sort();
//        Collections.rotate();
//        Collections.max();
//        Collections.min();
    }

    public static void Date_Time_Formatting()
    {
        //LocalDateTime:-

        // Current Date and Time:
        LocalDateTime localDateTime = LocalDateTime.now();

        // Setting custom date and time:
        LocalDateTime localDateTime2 = LocalDateTime.of(2024,12,31,24,60,60);

        // Adding/Subtracting value to Date and Time:
        localDateTime = localDateTime.plusYears(1).minusYears(1).plusMonths(1).plusMinutes(30).minusSeconds(60);

        // Getting Date and Time:
        int hour = localDateTime.getHour();
        localDateTime.getSecond();
        localDateTime.getDayOfWeek();
        localDateTime.getDayOfYear();
        localDateTime.getYear();

        // Duration between two localDateTime:
        Duration duration = Duration.between(localDateTime2, localDateTime);
        long days = duration.toDays();
        duration.toSeconds();
        duration.toMinutes();
        duration.toHours();

        // Formatting localDateTime:
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd : HH-mm-ss");
        String formatted = localDateTime.format(dateTimeFormatter);
    }

    public static void randomNumberGenerator()
    {
        SecureRandom random = new SecureRandom();
        random.nextInt();
        random.nextBoolean();
        random.nextDouble();
        random.nextInt(0, 10);
    }
}

