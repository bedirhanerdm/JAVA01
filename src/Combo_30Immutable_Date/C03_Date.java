package Combo_30Immutable_Date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih); // 2022-07-23

        System.out.println(tarih.getDayOfYear()); // 204
        System.out.println(tarih.getDayOfMonth()); // 23
        System.out.println(tarih.getMonth()); // JULY
        System.out.println(tarih.getMonthValue()); // 7

        System.out.println(tarih.isLeapYear()); // Artik yil mi degil mi sonucu: false


        LocalDate tarih2 = LocalDate.of(2001, 10, 25);
        System.out.println(tarih2); // 2001-10-25

        LocalDate tarih3 = LocalDate.of(2001, Month.OCTOBER, 25);
        System.out.println(tarih3); // 2001-10-25


        System.out.println(tarih.plusYears(3).plusMonths(1).plusDays(10)); // 2025-09-02

        System.out.println(tarih); // 2022-07-23

        System.out.println(tarih.minusWeeks(15)); // 2022-04-09


        System.out.println(tarih.minusMonths(4).minusWeeks(2)
                .minusYears(8).minusDays(6)); // 2014-03-03


        System.out.println(tarih.minusYears(2023)); // -0001-07-23

        System.out.println(tarih); // 2022-07-23




        // iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk oldugunu bulunuz

        if (tarih2.isAfter(tarih3)){

            System.out.println(tarih3 + " tarihinde dogan daha buyuk");

        } else if (tarih3.isAfter(tarih2)) {

            System.out.println(tarih2 + " tarihinde dogan daha buyuk");

        } else {

            System.out.println("Yasitsiniz");
        }


    }
}
