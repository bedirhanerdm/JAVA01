package Combo_05Increment;

import java.util.Scanner;

public class RakamlarToplami {

    public static void main(String[] args) {

        //kullanicidan 4 basamakli sayi al ve rakamlar toplamini yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif tam sayi giriniz..");
        int sayi=scan.nextInt(); //5267

        int birlerbasamagi=0;
        int rakamlartoplami=0;

        //suanda sayi 5267 bb=0 rt=0

        birlerbasamagi=sayi % 10; //7
        rakamlartoplami += birlerbasamagi;

        sayi /=10; //sayiyi 10a bolduk boylece birler basamagini attik, suanda sayi 526

        birlerbasamagi=sayi %10;
        rakamlartoplami+=birlerbasamagi;

        sayi /=10; //suanda sayi 52

        birlerbasamagi=sayi %10;
        rakamlartoplami+=birlerbasamagi;

        sayi /=10; //suanda sayi 5

        birlerbasamagi = sayi;
        rakamlartoplami+=birlerbasamagi;

        System.out.println("rakamlar toplami = " + rakamlartoplami);


    }
}
