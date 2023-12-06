package Combo_24ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElemanBulma {

    public static void main(String[] args) {

        /*
        2 string array olustur
        bu arraylerdeki ortak elemanlari for each ile bul
        sonucu yazdir
        ortak yoksa uyari ver
         */

        String[] arr1= {"Ali", "Veli", "Can", "Ayse"};
        String[] arr2={"Ali", "Hasan","Ayse","Enes"};

        List<String> ortakIsimler = new ArrayList<>();

        for (String each1:arr1
             ) {

            for (String each2:arr2
                 ) {

                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }

            }

        }
        if (ortakIsimler.isEmpty()){
            System.out.println("Hic ortak eleman yok");
        }else {

            System.out.println("Her iki arraydeki ortak isimler: " + ortakIsimler);
        }
    }
}
