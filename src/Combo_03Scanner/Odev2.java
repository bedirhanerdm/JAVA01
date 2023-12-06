package Combo_03Scanner;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin kenar uzunlugunu giriniz..");

        double  x=scan.nextDouble();

        System.out.println("Karenin cevresi: "+(4*x)+", Karenin alani: "+(x*x));
    }
}
