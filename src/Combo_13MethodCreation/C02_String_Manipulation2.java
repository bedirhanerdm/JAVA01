package Combo_13MethodCreation;

import java.util.Scanner;

public class C02_String_Manipulation2 {
    public static void main(String[] args) {

        /*

        sifre iste
        sartlari sagliyorsa basarili
        yoksa basarisiz
        +ilk harf buyuk
        +son harf kucuk
        +sifrede bosluk yok
        +sifre uzunlugu en az 8 karakter

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifre giriniz");
        String sifre=scan.nextLine();

        int kontrol=0;  //Her olumlu sonucta bir artiricaz, en son olmasi gereken
                        //olumlu sonuc kadar degeri olacak

        //ilk harf kontrol
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;

        }else{
            System.out.println("Ilk harf buyuk olmalidir.");
        }

        //son harf kontrol
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;

        }else {
            System.out.println("Son harf buyuk olmalidir.");
        }

        //bosluk kontrol
        if (sifre.contains(" ")){
            System.out.println("Sifrede bosluk olmamalidir.");

        }else {
            kontrol++;
        }

        //sifre uzunluk kontrol
        if (sifre.length()>=8){
            kontrol++;

        }else {
            System.out.println("Lutfen sifre 8 karakterden fazla karakter icersin");
        }

        //kontrol testi
        if (kontrol==4){
            System.out.println("Sifre basari ile tanimlandi.");

        }else {
            System.out.println("Islem basarisiz, sifreyi gozden gecirin.");
        }



    }
}
