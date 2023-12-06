package Combo_24ArrayLists_ForEachLoop;

import java.util.*;

public class C02_ListedenSayiBulma {

    public static void main(String[] args) {

        /*
        Icinde 200 tane 1000den kucuk p+ tam sayi olan lis olustur
        kullanician sayi iste ve listede var mi diye bak
         */

        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {

            sayi = rnd.nextInt(1000);

            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi){

            System.out.println("Lutfen bir sayi tahmininde bulununuz");
            sayi=scan.nextInt();

            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler, " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;

            }else {

                System.out.println(tahminSayisi + " adet sayi soylediniz fakat hic biri listede yok");
                tahminSayisi++;
            }
        }

    }

}
