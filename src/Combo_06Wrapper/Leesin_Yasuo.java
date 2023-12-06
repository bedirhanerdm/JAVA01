package Combo_06Wrapper;

import java.util.Scanner;

public class Leesin_Yasuo {
    public static void main(String[] args) {

        /*
        Wrapper class Javanin hazir methodlarini kullanabilmemiz icin
        primitivelere actigi classlardir/
         */

        boolean buguzelmi=true;

        //boolean primitive o yuzden hazir method yok

        Boolean buGuzelmi=true;
        buGuzelmi.toString();

        System.out.println(Short.MIN_VALUE); //32768
        System.out.println(Short.MAX_VALUE); //-32767

        /*
        int=Integer, char=Character gerisi ayni
         */

        String ogrno="123456";

        //kullanicidan sifre iste
        //eger sifre sadece rakam iceriyorsa kabul etme

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz..");

        String sifre=scan.nextLine();

        Integer sifresayi=Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlasi = " + (sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi = " + (sifresayi+3));

        /*
        Wrapper classlar ilerde kullanabilecegimiz faydali hazir methodlar icerir
         */


    }
}
