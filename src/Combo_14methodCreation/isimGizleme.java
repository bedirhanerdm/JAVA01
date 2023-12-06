package Combo_14methodCreation;

import java.util.Scanner;

public class isimGizleme {
    public static void main(String[] args) {
        //isim ve soyismin ilk harfleri gozuksun gerisi ****

        Scanner scan=new Scanner(System.in);
        System.out.print("Isminizi giriniz= ");
        String isim=scan.next();

        System.out.print("Soyisminizi giriniz= ");
        String soyisim=scan.next();

        ismiGizle(isim,soyisim); //B******* E****
        System.out.println(isim+" "+soyisim); //bedirhan erdem
    }

    private static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w","*");

        System.out.println("Isminiz= "+ isim);
        System.out.println("Soyisminiz= "+soyisim);

    }
}
