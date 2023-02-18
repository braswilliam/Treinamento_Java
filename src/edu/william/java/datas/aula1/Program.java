package edu.william.java.datas.aula1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //formatador de data
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //formatador de data
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20"); // posso colocar um texto no formato ISO 8601.
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26z"); //zulu Time
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // especificando por tipezone

        //formadando datas apartir do formatador de datas:
        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")); //Formatando data.
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // chamando um obj formatador


        LocalDate d10 = LocalDate.of(2002, 7, 20); //utilizando o of e passando as informações
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03); //GMT Horário de Londres.
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d010 = " + d10);
        System.out.println("d011 = " + d11);




    }
}
