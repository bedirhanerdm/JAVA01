package Combo_14methodCreation;

import java.util.Scanner;

public class tarihSehirAlma {
    public static void main(String[] args) {

        /*
        kullanicidan sehir ve dogum tarihi al
        bunlari kullanacagimiz formatta bize donduren method olustur
        sehir ismini buyuk harf
        tarihi ise 2022-06-30 seklinde
         */

        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("Girdiginiz sehir= " + sehir);
        System.out.println("Girdiginiz tarih= " + tarih);

    }

    public static String tarihAl() {

        String tarih="";
        Scanner scan=new Scanner(System.in);

        //yili bulalim
        System.out.println("Dogum yilinizi giriniz");
        int yil=scan.nextInt();

        if (yil>1900 && yil<2022){
            tarih=yil+"-";
        }else{
            System.out.println("Lutfen gecerli yil yaziniz (1900-2022)");
        }

        //ayi bulalim
        System.out.println("Lutfen kacinci ay oldugunu tam sayi olarak giriniz");
        int ay=scan.nextInt();

        if (ay<0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
    }

        //gunu bulalim
        System.out.println("Lutfen gunu tam sayi olarak giriniz");
        int gun=scan.nextInt();

        if (gun<0 || gun>31) {
            System.out.println("Lutfen 1-31 arasinda sayi giriniz");

        } else if (gun>0 && gun<10) {
            tarih=tarih+"0"+gun;

        }else {
            tarih=tarih+gun;
        }

        return tarih;

    }

    public static String sehirAl() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehir=scan.next().toUpperCase();

        return  sehir;
    }

}
