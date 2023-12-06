package Combo_10StringManipulation;

public class Length_Null {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.length()); // str'in karakter sayisini dondurur

        System.out.println(str.charAt(str.length())-1); // son karakter

        System.out.println(str.charAt(str.length()-3)); // sondan 3. karakter

        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hic bir deger almadiginin isaretcisidir
         */

        String str2=""; // deger atanmisdir ama bu bir hiclik

        System.out.println(str2.length()); // 0

        String str3= null; // atanmamis degeri simgeler

        System.out.println(str3.length()); // deger atanmamis o yuzden uzunluk olmaz
                                           // NullPointerException olarak hata verir


    }
}
