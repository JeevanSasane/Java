package java8;

import javax.swing.text.DateFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class LocalDateAndTimeDemo {

    public static void main(String[] args) {

//        Date date=new Date();
//        System.out.println(date);
//
//        System.out.println(System.currentTimeMillis());
//
//
//        LocalDate localDate=LocalDate.now();
//        System.out.println(localDate);
//
//        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println(dateTimeFormatter.format(localDate));
//
//        System.out.println(localDate.getDayOfMonth());
//        System.out.println(localDate.getDayOfWeek());
//        System.out.println(localDate.getDayOfYear());
//
//        System.out.println(localDate.plusDays(3));
//
//        ZoneId zoneId=ZoneId.of("America/Sao_Paulo");
////        LocalDateTime localDateTime1=LocalDateTime.now(zoneId);
//
//        LocalDate localDate1=LocalDate.now(zoneId);
//        System.out.println(localDate1);
//

        LocalDateTime localDateTime1=LocalDateTime.of(2021,12,3,12,44);
        LocalDateTime localDateTime2=LocalDateTime.of(2020,12,3,12,44);
        Duration duration=Duration.between(localDateTime1,localDateTime2);
        System.out.println(duration);

        LocalDate localDate=LocalDate.of(2020,12,5);
        LocalDate localDate1=LocalDate.now();

        Period period=Period.between(localDate,localDate1);
        System.out.println(period);

    }
}
