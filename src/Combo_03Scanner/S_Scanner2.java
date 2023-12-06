package Combo_03Scanner;

import java.util.Scanner;

public class S_Scanner2 {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayı alıp toplamını yazdır.

        //1. adim
        Scanner scan = new Scanner(System.in);

        //2. adim
        System.out.println("Lutfen ilk sayiyi giriniz..");

        //3. adim
        double sayi1 = scan.nextDouble();

        //4. adım tekrarla
        System.out.println("Lutfen ikinci sayiyi giriniz..");
        double sayi2 = scan.nextDouble();

        System.out.println("Sayilarin carpimi= " + sayi1*sayi2);

    }

}
