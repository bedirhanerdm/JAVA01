package Combo_09TernaryOperator;

import java.util.Scanner;

public class Ternary3 {
    public static void main(String[] args) {

        /*
        Kullanicidan sayi iste, pozitifse yazdir, 0 veya negatifse
        bir sayi daha iste ve carpimini yazdir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");
        double sayi=scan.nextDouble();

        if (sayi > 0) {
            System.out.println("sayi = " + sayi);
        } else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2=scan.nextDouble();
            System.out.println(sayi*sayi2);

            //Eger if else icerisinde yeni yazilmasi gereken degerler
            //varsa ternary yapilmaz.
        }
    }
}
