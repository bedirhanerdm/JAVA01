package Combo_14methodCreation;

import java.util.Scanner;

public class isimGizleme2 {
    public static void main(String[] args) {

        //Oncekiyle ayni olacak, ve bundan sonra en basta girilmis input, method ile degistirilmis haline donussun

        //void olan bir methodu "String yeniIsim=ismiGizle(isim,soyisim);" yaparsak uyari verir


        Scanner scan=new Scanner(System.in);
        System.out.print("Isminizi giriniz= ");
        String isim=scan.next();

        System.out.print("Soyisminizi giriniz= ");
        String soyisim=scan.next();

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);
    }

    private static String isimGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()
                + isim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()
                + soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;
    }
}
