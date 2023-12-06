package Combo_29PassByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {

    /*

    Bir List olusturalim
    bir methodda sadece elemanlari degistirelim
    digerinde ise yeni list atayip ayni sayida yeni eleman ekleyelim

    her iki method calldan sonra kendi listemizi main method icinde kontrol edelim

     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("Ilk basta List: " + list ); // [Ali, Veli, Can]

        elemanlariDegistir(list); // [Oguz, Murat, Fatih]

        System.out.println("elemanDegistir methodundan sonra list: " + list); // [Oguz, Murat, Fatih]

        listDegistir(list); // [Nutella, Cay, Cokokrem]

        System.out.println("listDegistir methodundan sonra list: " + list); // [Oguz, Murat, Fatih]

    }

    public static void listDegistir(List<String> list) {

        list = new ArrayList<>();

        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("listDegistir methodunda list: " + list);
    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0,"Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");

        System.out.println("elemanDegistir methodunda list: " + list);

    }
}
