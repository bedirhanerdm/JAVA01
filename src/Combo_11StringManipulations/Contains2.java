package Combo_11StringManipulations;

import java.util.Scanner;

public class Contains2 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        String cumle=scan.nextLine();
        cumle=cumle.toLowerCase();

        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("kucuk")&&cumle.contains("buyuk")) {
            System.out.println("uy karar ver kocaman mi kuccuk mu olsun?");

        }else {
            System.out.println("Cumlede buyuk veya kucuk kelimesi yok");
        }
    }
}
