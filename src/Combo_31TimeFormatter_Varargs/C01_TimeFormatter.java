package Combo_31TimeFormatter_Varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {

    public static void main(String[] args) {


        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("ulan olusturulan tarih: " + tarihSaat); // 2022-07-25T21:48:44.890056100

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm");

        System.out.println(dtf1.format(tarihSaat)); //  25/7/22 09:48



        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyy HH:mm");

        System.out.println(dtf2.format(tarihSaat)); //  25/Tem/2022 21:48
    }
}
