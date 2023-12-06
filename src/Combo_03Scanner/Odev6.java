package Combo_03Scanner;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi ve soyisminizi ayri ayri giriniz..");

        String isim=scan.nextLine();
        String soyisim=scan.next();

        System.out.println("Isim - Soyisim : "+isim+" "+soyisim);
    }
}
