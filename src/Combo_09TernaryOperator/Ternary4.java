package Combo_09TernaryOperator;

import java.util.Scanner;

public class Ternary4 {
    public static void main(String[] args) {

        /*
        Kullanicidan harf iste, buyuk harf ise buyuk harf yazdir
        kucuk harfte de ayni sekilde
        harf degilse hata ver
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir harf giriniz..");
        char harf=scan.next().charAt(0);

        String sonuc= (harf>='a' && harf<='z') ? ("Kucuk harf") :
                (harf>='A' && harf<='Z') ? ("Buyuk harf") : ("Gecersiz karakter");

    }
}
