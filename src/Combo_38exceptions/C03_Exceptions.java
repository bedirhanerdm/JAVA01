package Combo_38exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        /*
        Marketteki tum urunleri bir arrayde tuttugumuzu varsayalim
        Kullaniciya index sorup o indexteki urunu yazdiran program
        Kullanici urun sayisindan buyuk sayi girerse,
        exception vermesinin onune gecelim
         */

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan = new Scanner(System.in);
        System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenIndex = scan.nextInt();

        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenIndex-1]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Istediginiz sira listemizde bulunmuyor " +
                    "\nSira numarasi en fazla " + urunler.length + " olabilir");

            System.out.println(e);

        }


    }

}
