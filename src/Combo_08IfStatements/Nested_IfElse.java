package Combo_08IfStatements;

import java.util.Scanner;

public class Nested_IfElse {
    public static void main(String[] args) {
        /*
        Emeklilik kontrolu yapan program,
        cinsiyet e=erkek, k=kadin degiskeni kabul etsin
        farkli harf veya sembol oldugunda hata versin

        emeklilikte kadin yas siniri 60, erkekte 65
        negatif ve 80 yas ustu hata verir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi  (kadin icin k, erkek icin e harfi)");
        char gender = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double age = scan.nextDouble();

        if (gender == 'E') {
            if (age<0 || age>80){
                System.out.println("Gecerli yas giriniz..");
            } else if (age<65) {
                System.out.println("emekli olamazsiniz.");
            }else {
                System.out.println("emekli olabilirsiniz");
            }
        } else if (gender=='K') {

            if (age<0 || age>80){
                System.out.println("Gecerli yas giriniz..");
            } else if (age<60) {
                System.out.println("emekli olamazsiniz.");
            }else {
                System.out.println("emekli olabilirsiniz");
            }
        }else {
            System.out.println("Lutfen gecerli cinsiyet giriniz");
        }

    }
}
