package Combo_14methodCreation;

import java.util.Scanner;

public class methodCreation {
    public static void main(String[] args) {

        //3 basamakli sayi al ve rakalmarini topla yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamakli sayi giriniz");
        int sayi=scan.nextInt();

        rakamlariTopla(sayi);

    }

    public static void rakamlariTopla(int sayi) {

        int birler=0;
        int rakamlarT=0;
        int asilsayi=sayi;

        birler=sayi%10;
        rakamlarT+=birler;
        sayi/=10;

        birler=sayi%10;
        rakamlarT+=birler;
        sayi/=10;

        birler=sayi%10;
        rakamlarT+=birler;
        sayi/=10;

        System.out.println("Girdiginiz " + asilsayi + " sayisinin rakamlari toplami = " + rakamlarT);
    }
}
