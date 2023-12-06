package Combo_04Casting;

public class Yas_Malp_Ori_Miss_Seraphine {
    public static void main(String[] args) {
        char harf='a';
        char yeniharf=(char)(harf+1);
        /*
        eger ki harf+1 yapsaydik a harfinin matematiksel degeri yani 97+1=98 verecekti
        ve char olmayacagi icin hata verecekti
        fakat biz bu 98in char karsiligini yani byi gostermesini sagladik.

         */

        System.out.println("yeni harf = " + yeniharf);
        
        /*
        Bazen bir variable'a olusturuldugu data turu disinda bir deger atanabilir,
        ve bunlardan bazisini Java otomatik atarken bazilari elle atanir.
        
         */
        
        int sayi1 = (int)(7.3);
        System.out.println("sayi1 = " + sayi1);
        
        double sayi2 = 10;
        System.out.println("sayi2 = " + sayi2); //10.0
        
        int sayi3 = 'c';
        System.out.println("sayi3 = " + sayi3); //99
        
        char harf2 = 98;
        System.out.println("harf2 = " + harf2); //b
        
        
    }
}
