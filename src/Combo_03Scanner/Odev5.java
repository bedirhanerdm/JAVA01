package Combo_03Scanner;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi ve soyisminizi ayrı ayrı giriniz..");

        String isim=scan.nextLine();
        String soyisim=scan.next();

        System.out.println("Isminiz: "+isim+"\nSoyisminiz: "+soyisim+"\nKursumuza katiliminiz alinmistir, tesekkur ederiz.");
    }
}
