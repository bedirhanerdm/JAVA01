package Combo_23arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {


        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Liste boyutu: " + sayilar1.size());

        sayilar1.add(2);
        sayilar1.addAll(sayilar1);

        System.out.println("Listenin yeni boyutu: " + sayilar1.size());

        sayilar1.set(2,8); // 2. indexi 8 yapacak (3. sayiyi)

        System.out.println(sayilar1);

        /*

        set methodu index yerine yenisini ekler,

        eger eskisini silmek istemiyorsak
        add(index, deger) methodunu kullanabiliriz.


         */
    }
}
