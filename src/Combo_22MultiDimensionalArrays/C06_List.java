package Combo_22MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        // Length i esnek olan arraydir, fakat elementleri tek tek eklemek gerekir
        // arraylistte sembol olarak <> kullaniriz

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler); // []

        // eleman ekleyeceksek;

        isimler.add("Basak");

        System.out.println(isimler); // Basak

        System.out.println(isimler.add("Ayse")); // true dondurur

        /*

        Stringte bir method calistirinca assign yapmazsak String degismiyor.

        String isim = "Suleyman"
        isim.toUpperCase(); // SULEYMAN
        System.out.println(isim) --> Suleyman


         */
        System.out.println(isimler);


    }

}
