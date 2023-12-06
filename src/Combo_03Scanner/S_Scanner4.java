package Combo_03Scanner;

import java.util.Scanner;

public class S_Scanner4 {
    public static void main(String[] args) {

        //onceki soruyu tek seferde yapınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz \naralarda ENTER tuşuna basiniz");

        String isim=scan.nextLine();
        String soyisim=scan.next();
        double yas=scan.nextDouble();

        System.out.println("Girilen bilgiler: "+isim+" ,"+soyisim+" ,"+yas);
    }
}
