package Combo_03Scanner;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yaricap uzunlugunu giriniz..");

        double x=scan.nextDouble();

        System.out.println("Pi'yi 3 alırsak..");
        System.out.println("Cemberin cevresi: "+(2*3*x)+", Dairenin alani: "+(3*x*x));

    }
}
