package Combo_15Overloading_forLoop;

public class overloading {
    public static void main(String[] args) {

        /*
        Javada olusturulan methodlarin isminin, yaptigi isle uyumlu olmasi istenir.
         */

        String str="Bu Java ogrenilecek, baska yolu yok";

        str.substring(2);
        str.substring(2,4);

        str.replace('c','v');
        str.replace("J","H");

        /*

        aynis isimde ama farkli method olusturmak icin degistirebilecegimiz seyler:
        +Parametre sayisi
        +Ayni sayida parametre olsa bile, parametre data turleri
        +Ayni sayida ve data turunde parametresi olan methodlarda, parametre siralamasi degistirilir.

         */
    }
}
