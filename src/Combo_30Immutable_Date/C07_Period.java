package Combo_30Immutable_Date;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_Period {

    public static void main(String[] args) {


        // 2 tarih arasi sureyi bulma

        LocalDate tarih1 = LocalDate.of(2001, 10, 25);
        LocalDate bugun = LocalDate.now();

        Period period = Period.between(tarih1,bugun);

        System.out.println(period); // P20Y8M28D

    }

}
