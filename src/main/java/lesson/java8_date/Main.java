package lesson.java8_date;

import java.time.*;
import java.time.temporal.*;

public class Main {
    public static void main(String[] args) {
        //Виды дат:
        /*
        Введение https://vertex-academy.com/tutorials/ru/new-date-time-api-java8/
Часть 1 Получение текущей даты https://vertex-academy.com/tutorials/ru/new-date-time-api-java8/
Часть 2 Прибаление, отнимание даты https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-2/
Часть 3 Сравнение дат https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-3/
Часть 4 Форматирование даты для вывода https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-4/
Часть 5 Временные зоны https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-5/
Часть 6 Получение периода, разницы между двумя датами https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-5-2/
Часть 7 Получение последнего дня месяца и подобные операции https://vertex-academy.com/tutorials/ru/java-8-new-date-time-api-chast-7/
         */
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        //Создание своей даты:
        LocalDate date2 = LocalDate.of(1990, 5, 20);
        System.out.println(date2);

        LocalDateTime date3 = LocalDateTime.of(1990,9,13,14,30);
        System.out.println(date3);


        //Получение конретных данных из даты
        System.out.println(date3.getYear());
        System.out.println(date3.getDayOfMonth());
        System.out.println(date3.getMonth().getValue());


        //Сравнение дат
        System.out.println(date1.compareTo(date2));

        System.out.println(date1.isAfter(date2));
        System.out.println(date2.isBefore(date1));

        //Вычислить последний день месяца
        TemporalAdjuster lastDayOfMonth = TemporalAdjusters.lastDayOfMonth();
        LocalDate lastDate = date2.with(lastDayOfMonth);
        System.out.println(lastDate.getDayOfMonth());


        //Сложение дат
        LocalDate newDate = date2.plusDays(3);
        System.out.println(newDate);

        //Вычитание дат
        newDate = date2.minusYears(1);
        System.out.println(newDate);

        //Вычислить разницу между двумя датами
        System.out.println(date2);
        Period period = Period.between(date2, date1);
        System.out.println(period.getYears());


        long days = ChronoUnit.DAYS.between(date2, date1);
        System.out.println(days);


        LocalDateTime ld1 = LocalDateTime.of(2020,7,4, 15, 0);
        LocalDateTime ld2 = LocalDateTime.of(2020,7,5, 16, 0);
        long hours = ChronoUnit.HOURS.between(ld1, ld2);
        System.out.println(hours);




    }
}
