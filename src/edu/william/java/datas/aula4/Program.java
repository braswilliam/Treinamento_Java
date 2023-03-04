package edu.william.java.datas.aula4;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

    public static void main(String[] args) {


        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26z");


        LocalDate pastWeekLocalDate = d04.minusDays(7); // Vai receber o d4 - 7 dias.
        LocalDate nextWeekLocalDate = d04.plusDays(7);


        System.out.println("Date now = "+ d04.getDayOfMonth());
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        System.out.println();

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); // Vai receber o d4 - 7 dias.
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("Date now = "+ d05.getDayOfMonth() + ", Hora: " + d05.getHour()+ ":" + d05.getMinute());

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDateTime);

        System.out.println();

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); // 7 unidade temporal em dias.
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = "+ pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        System.out.println();

        //podemosusaro atTime ou o atStartOfDay
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0, 0));
        System.out.println("t2 dias = " + t1.toDays());

        System.out.println();

        //Calculando dias(pastWeekLocalDateTime - 20 = 7)
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 dias = " + t2.toDays());

        System.out.println();

        Duration t3 = Duration.between(pastWeekInstant,d06);
        System.out.println("t3 = "+ t3.toDays());







    }


}
