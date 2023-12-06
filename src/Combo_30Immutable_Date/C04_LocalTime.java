package Combo_30Immutable_Date;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);  // 19:14:51.226332600

        /*
        Bizim olusturdugumuz date ve time canli degildir, calistirdigimiz anda olcer ve yazdirir.
        Sabittir.
         */

        Thread.sleep(3000);
        t1 = LocalTime.now();

        System.out.println(t1); // 19:14:54.229332600



    }

}
