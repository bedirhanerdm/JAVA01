package Combo_22MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {

    public static void main(String[] args) {

        // List <int> sayilar = new ArrayList<>();
        // List primitive data turlerini kabul etmez

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);

        //sadece add kullanirsak java sona ekler

        sayilar.add(2,10); // indexi 2 olan yere 10u ekler

        System.out.println(sayilar); // [5,3,10,7]

        // eskileri silmez yenisini ekler
    }
}
