package Combo_30Immutable_Date;

import java.time.Instant;
import java.time.LocalDateTime;

public class C06_LocalDateTime {

    public static void main(String[] args) {


        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts); // 2022-07-23T19:46:28.132823400

        System.out.println(ts.minusHours(20).plusDays(15).minusYears(4).plusSeconds(35)); // 2018-08-06T23:47:03.132823400
    }
}
