package Combo_23arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove methodu 2 sekilde kullanilir

        1) objeyi yazip silmesini istersek bize boolean sonuc dondurur
        2) Index girersek o indexteki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram")); // True
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]


        System.out.println(urunler.remove(1)); // Cekirdek
        System.out.println(urunler); // [Nutella, Cay]



    }
}
