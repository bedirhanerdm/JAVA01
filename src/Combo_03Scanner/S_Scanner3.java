package Combo_03Scanner;

import java.util.Scanner;

public class S_Scanner3 {
    public static void main(String[] args) {

        /*
        kullanicidan ismini soyismini ve yasini alip girilen bilgiler
        = Bedirhan erdem 21 seklinde yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz..");

        //alinacak bilgi tek kelimeyle sinirlandirilacaksa next, birden fazla olabilecekse nextline kullanilir

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz..");
        String soyisim= scan.next();

        System.out.println("Lutfen yasinizi giriniz..");
        int yas= scan.nextInt();

        System.out.println("Isminiz: " + isim + ", Soyisminiz: " + soyisim + ", Yasiniz: " + yas);
    }
}
