package edu.william.java.datas.aula6;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program2 {


    public static void main(String[] args) {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println( "Imprimindo adatacom 3 horas de antecedeência por conta do Greenwich: " + sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);


        System.out.println("Minuts: " + minutes);
        System.out.println("Month: " + month);


    }


}
