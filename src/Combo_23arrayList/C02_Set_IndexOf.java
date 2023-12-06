package Combo_23arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Set_IndexOf {

    public static void main(String[] args) {

        /*

        urunler listesi olustur
        istenen siradaki urunu yeni urunle degistirip
        eski urunu, varolan eski urunler listesine ekleyelim

         */

        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");



        List<String> eskiUrunler = new ArrayList<>();

        // Ikramin yerine biskrem koyalim ve ikrami eski urunlere ekleyelim

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        System.out.println("Urunler listesi: " + urunler);

        int temp = urunler.indexOf(silinecekUrun);

        String silinenUrun = urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi: " + urunler);
        System.out.println("Eski urunler listesi: " + eskiUrunler);

        // indexOf aramaya bastan baslayip aradigimiz urunun indexini verir,
        // lastIndexOf ise sondan baslayip aradigimiz urunun indexini yazdirir

    }
}
