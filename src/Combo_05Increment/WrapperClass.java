package Combo_05Increment;

public class WrapperClass {
    public static void main(String[] args) {

        String str="Java cok guzel";
        str.toUpperCase();

        int sayi=10;
        /*
        primitive data turlerinde methodlar olmaz
        java bazi methodlari kullanmamiz icin her primitive data turu icin wrapper class olusturmustur
         */

        Integer sayi2=10;

        sayi2.byteValue();
    }
}
