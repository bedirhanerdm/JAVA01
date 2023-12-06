package Combo_12stringManipulations;

import java.util.Scanner;

public class sayiIsmiGirme_Switch {
    public static void main(String[] args) {

        /*
        3 basamakli sayi al
        sayinin hanelerini kelime olarak tek tek yazdir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int a = sayi / 100;
        int b = (sayi / 10) % 10;
        int c = sayi % 10;


        if (sayi > 99 && sayi < 1000) {
            switch (a) {
                case 1:
                    System.out.println("yuz");
                    break;

                case 2:
                    System.out.println("iki yuz");
                    break;

                case 3:
                    System.out.println("uc yuz");
                    break;

                case 4:
                    System.out.println("dort yuz");
                    break;

                case 5:
                    System.out.println("bes yuz");
                    break;

                case 6:
                    System.out.println("alti yuz");
                    break;

                case 7:
                    System.out.println("yedi yuz");
                    break;

                case 8:
                    System.out.println("sekiz yuz");
                    break;

                case 9:
                    System.out.println("dokuz yuz");
                    break;
            }

            switch (b) {
                case 0:
                    System.out.println(" ");
                    break;

                case 1:
                    System.out.println("on");
                    break;

                case 2:
                    System.out.println("yirmi");
                    break;

                case 3:
                    System.out.println("otuz");
                    break;

                case 4:
                    System.out.println("kirk");
                    break;

                case 5:
                    System.out.println("elli");
                    break;

                case 6:
                    System.out.println("altmis");
                    break;

                case 7:
                    System.out.println("yetmis");
                    break;

                case 8:
                    System.out.println("seksen");
                    break;

                case 9:
                    System.out.println("doksan");
                    break;
            }

            switch (c) {
                case 0:
                    System.out.println(" ");
                    break;

                case 1:
                    System.out.println("bir");
                    break;

                case 2:
                    System.out.println("iki");
                    break;

                case 3:
                    System.out.println("uc");
                    break;

                case 4:
                    System.out.println("dort");
                    break;

                case 5:
                    System.out.println("bes");
                    break;

                case 6:
                    System.out.println("alti");
                    break;

                case 7:
                    System.out.println("yedi");
                    break;

                case 8:
                    System.out.println("sekiz");
                    break;

                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }else {
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }

    }
}
