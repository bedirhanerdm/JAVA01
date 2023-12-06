package Combo_03Scanner;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Ardarda 2 tane tam sayi giriniz..");

        int x=scan.nextInt(), y=scan.nextInt();

        System.out.println("Sayilarin toplami, farklari ve carpimlari sirayla belirtilmistir: "+(x+y)+", "+(x-y)+", "+(x*y));

    }
}
