package Combo_20Arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {

        // birden fazla variable depolamak icin kullanilabilen object(non-primitive data) turleridir
        //Bir array icindeki tum variable lar ayni data turunde olmalidir
        // int myArray[];

        int sayilar [] = new int[7];  //new intten sonra length uzunlugunu giriyoruz

        System.out.println(sayilar); // [I@19dfb72a

        //non-primitive datalari her zaman direkt yazdiramayiz
        // Java Arrays classlarindan yardim alinir

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0, 0, 0, 0, 0]

        sayilar[2]=10;

        sayilar[0]=5;

        sayilar[1]=3;

        System.out.println(sayilar); //[I@19dfb72a
        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10, 0, 0, 0, 0]

        String sinifList[]={"Ali", "Ayse", "Ahmet"};
        System.out.println(Arrays.toString(sinifList)); // [Ali, Ayse, Ahmet]

        sinifList[1]="Hasan";

        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]); // Hasan yazdirir
        System.out.println(sinifList[0]); // Ali yazdirir

    }
}
