package Combo_07Statements;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        /*
        kullanicidan karakter isteyin ve girilenin harf olup olmadigini yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");

        char x =scan.next().charAt(0);

        if ((x >='a' && x <='z') || (x >'A' && x <='Z')){              //ASCII tablosundan yola cikarak yaptik
            System.out.println("Girilen karakter bir harftir.");
        } else {
            System.out.println("Girilen karakter bir harf degil");
        }
    }
}
